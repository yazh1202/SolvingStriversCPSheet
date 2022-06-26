package implementation;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ORInMatrix486B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int ones = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    ones++;
                }
            }
        }

        //Converting the
        convert(arr, m, n, ones);
    }

    //Simple solution using the fact tha OR will only give 0 if the entire row or column
    //is zero, checking using the obtained array via this and the input array, to find out
    //whether it is obtainable
    static void convert(int[][] arr, int m, int n, int ones) {
        int[][] res = new int[m][n];
        for (int[] arr1 : res) {
            Arrays.fill(arr1, 1);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    for (int r = 0; r < arr.length; r++) {
                        res[r][j] = 0;
                    }
                    for (int c = 0; c < arr[0].length; c++) {
                        res[i][c] = 0;
                    }
                }
            }
        }
        //The checking part is done via using the fact that we have to have at least one '1' in that row or column
        //of resultant array we calculated, for '1' in array that is taken as input
        boolean is = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    int or = 0;
                    for (int[] ints : res) or += ints[j];
                    for (int c = 0; c < arr[0].length; c++) or += res[i][c];
                    if (or == 0) {
                        is = false;
                        break;
                    }
                }
            }
        }
        if (is) {
            System.out.println("YES");
            for (int[] arr1 : res) {
                for (int s : arr1) {
                    System.out.print(s + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}
