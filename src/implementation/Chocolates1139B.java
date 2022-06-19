package implementation;

import java.util.Scanner;

public class Chocolates1139B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        int i;
        long csum = 0;
        long temp = Long.MAX_VALUE;
        /*Starting from the back and going on till either the array is exhausted or
         the previous value stored in temp array is lesser than or equal zero*/
        for (i = arr.length - 1; i >= 0; i--) {
            temp = Math.min(temp - 1, arr[i]);
            if (temp <= 0) {
                break;
            }
            csum += temp;
        }
        System.out.println(csum);
    }
}
