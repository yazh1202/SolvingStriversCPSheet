package implementation;

import java.util.Scanner;

//Look for relationships between numbers,rows and columns
public class PresentFromLena118B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, j = 0, k = 0, m = 0;
        for (i = 0; i < n + 1; i++) {
            //Printing out spaces for upper triangle
            for (j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            System.out.print("0");
            for (k = 1; k <= i; k++) {
                System.out.print(" " + k);
            }
            for (m = k - 2; m >= 1; m--) {
                System.out.print(" " + m);
            }

            if (i != 0) {
                System.out.print(" 0");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            //Printing out spaces for lower triangle
            for (j = 1; j <= 2 * (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.print("0");
            for (k = 1; k < n - i; k++) {
                System.out.print(" " + k);
            }
            for (m = k - 2; m >= 1; m--) {
                System.out.print(" " + m);
            }
            if (i != n - 1) {
                System.out.print(" 0");
            }
            System.out.println();
        }
    }
}
