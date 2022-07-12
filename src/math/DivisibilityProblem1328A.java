package math;

import java.util.Scanner;

public class DivisibilityProblem1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {

            long a = sc.nextLong();

            long b = sc.nextLong();

            if (a % b == 0) {

                System.out.println(0);

                continue;

            }

            long div = (a / b) + 1;

            System.out.println((b * div) - a);

        }
    }
}
