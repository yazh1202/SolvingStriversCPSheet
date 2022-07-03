package math;

import java.util.Scanner;

import static java.lang.System.in;

public class ArrayWithOddSum1296A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int odds = 0;
            int evens = 0;
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evens++;
                } else {
                    odds++;
                }
            }
            if ((odds == n && odds % 2 == 0) || evens == n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
