package math;

import java.util.Scanner;

public class CollectingCoins1294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            int max = Math.max(Math.max(a, b), c);
            n += (a + b + c);
            if (n % 3 == 0 && (n / 3) >= max) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static void solution1(int n, int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        n -= ((max - a) + (max - b) + (max - c));
        a += (max - a);
        b += (max - b);
        c += (max - c);
        System.out.println(n);
        if (n % 3 == 0 && (a == c) && (b == c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
