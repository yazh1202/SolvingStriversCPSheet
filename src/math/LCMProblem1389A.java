package math;

import java.util.Scanner;

public class LCMProblem1389A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (r < 2 * l) {
                System.out.println(-1 + " " + (-1));
            } else {
                System.out.println(l + " " + (l + l));
            }
        }
    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers959
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
