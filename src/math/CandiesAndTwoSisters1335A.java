package math;

import java.util.Scanner;

public class CandiesAndTwoSisters1335A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //(Odd+1)/2=even and (even+1)/2 is also even when integer types are used

        int tc = sc.nextInt();

        while (tc-- > 0) {

            long a = sc.nextLong();

            if (a == 1 || a == 2) {

                System.out.println(0);

                continue;

            }

            long mid = (a / 2)+1;

            System.out.println(a - mid);

        }
    }
}
