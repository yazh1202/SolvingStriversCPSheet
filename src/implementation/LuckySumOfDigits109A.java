package implementation;

import java.util.Scanner;

public class LuckySumOfDigits109A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        long sum = 0;
        long i = 0;
        long j = 0;
        StringBuilder str = new StringBuilder();
        //Using formula for minimum lucky numbers(as String)  = 4*m + 7*n
        while (sum < total) {
            sum = 4 * i;
            j = 0;
            long tempsum = sum;
            while (tempsum < total) {
                tempsum += 7;
                j++;
            }
            if (tempsum == total) {
                for (int a = 0; a < i; a++) {
                    str.append(4);
                }
                for (int b = 0; b < j; b++) {
                    str.append(7);
                }
                System.out.println(str);
                return;
            }
            i++;
        }

        System.out.println(-1);

    }
}
