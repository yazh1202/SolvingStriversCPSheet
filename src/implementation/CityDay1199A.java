package implementation;

import java.util.Scanner;

/*Whenever the problem involves finding a number between a range
 check if there is an ascending or descending pattern that can be seen */
public class CityDay1199A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
/*Optimised code which uses the valley nature of the day i.e. it being lower than the numbers surrounding it
  ,looking for the smaller numbers, storing their indexes continuously(in 'j') and returning when the smaller number is y
  indexes behind the current number or the end of the array is reached*/

        int i;
        int j = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] < arr[j]) j = i;
            if (i - j >= y) break;
        }
        System.out.println(j + 1);
    }

    //Initial Code using if else condition and loops internally to check the condition for city day
    public static void findDay(int[] arr, int x, int y) {
        int j;
        for (j = 0; j < arr.length; j++) {
            //Going Backward
            int k;
            for (k = 1; k <= x; k++) {
                if (j - k < 0 || arr[j] > arr[j - k]) {
                    break;
                }
            }
            //Going Forward
            int l;
            for (l = 1; l <= y; l++) {
                if (j + l >= arr.length || arr[j] > arr[j + l]) {
                    break;
                }
            }
            //Checking for bounds, numbers forward and backwards to find if the day is city day or not.
            if ((j + l >= arr.length && j - k < 0) || (k == x + 1 && l == y + 1) ||
                    (k == x + 1 && j + l >= arr.length) || (l == y + 1 && j - k < 0)) {
                System.out.println(j + 1);
                return;
            }
        }
    }
}
