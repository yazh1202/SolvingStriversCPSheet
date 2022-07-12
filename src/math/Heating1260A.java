package math;

import java.util.Scanner;

public class Heating1260A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Not fully understood, need to review it

        long a = sc.nextLong();

        long i = a;

        while (i-- > 0) {

            long k = sc.nextLong();

            long x = sc.nextLong();

            if (k == 1) {

                System.out.println(x * x);

                continue;

            }

            if (k >= x) {

                System.out.println(x);

                continue;

            }

            long sum = 0;

            long div = x / k;

            x -= (div) * k;

            sum += ((div + 1) * (div + 1) * x) + (k - x) * (div * div);

            System.out.println(sum);

        }

    }
}
