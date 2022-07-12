package math;

import java.util.Scanner;

public class DigitalRoot1107B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Using rule of 9's for repeated sums

//Adding 9 takes the current digit to the next column and

//keeps the same sum by having one less in the unit place

//and one more in 10's place

        long a = sc.nextLong();

        long i = a;

        while (i-- > 0) {

            long k = sc.nextLong();

            long x = sc.nextLong();

            if (k == 1) {

                System.out.println(x);

                continue;

            }

            long ans = x + (9 * (k - 1));

            System.out.println(ans);


        }
    }
}
