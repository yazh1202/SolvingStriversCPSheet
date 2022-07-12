package math;

import java.util.Scanner;

// Don't over if
public class YetAnotherTwoIntegersProblem1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long diff = Math.abs(a - b);
            long ans = Math.abs(b - a) / 10;
            if (diff % 10 != 0) {
                ans++;
            }
            System.out.println(ans);
        }
    }
}
