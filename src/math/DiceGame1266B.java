package math;

import java.util.Scanner;

public class DiceGame1266B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Need to give atlease 5 re-reads to the problem to get it, if not finding any possible solutions
        long a = sc.nextLong();

        long i = a;

        while (i-- > 0) {

            long size = sc.nextLong();

            if (size <= 14) {

                System.out.println("NO");

            } else {

                long left = size % 14;

                if (left == 0 || left > 6) {

                    System.out.println("NO");

                } else {

                    System.out.println("YES");

                }

            }

        }
    }
}
