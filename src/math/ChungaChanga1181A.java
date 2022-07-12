package math;

import java.util.Scanner;

public class ChungaChanga1181A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        long a = sc.nextLong();

        long b = sc.nextLong();

        long c = sc.nextLong();

        long total = (a + b) / c;

        long max = Math.max(a % c, b % c);

        long min = Math.min(a % c, b % c);

        if ((max + min) >= c) {

            long diff = c - max;

            System.out.println(total + " " + diff);

            return;

        }

        System.out.println(total + " " + 0);
    }
}
