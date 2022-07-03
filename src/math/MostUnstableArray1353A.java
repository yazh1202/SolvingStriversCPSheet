package math;

import java.util.Scanner;

public class MostUnstableArray1353A {
    //>(1294A)
    //> 1.  If distributing a number to other numbers, add all,
    // then divide by total members it is to be distributed to,
    // always check the division result isn't lower than the original numbers.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(m);
            } else {
                System.out.println(2 * m);
            }
        }
    }
}
