package implementation;

import java.util.Scanner;

//Go in reverse to find number of steps if forward takes too long
public class DoreamonAndStairs476A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = (n + 1) / 2;
        int res = ((min + m - 1) / m) * m;
        System.out.println(res);
    }

    //Takes O(n) Time complexity
    public static void calcSteps(int m, int n) {
        int twos = n / 2;
        int sum = n / 2 + (n % 2);
        if (sum % m == 0) {
            System.out.println(sum);
            return;
        }
        for (int i = 0; i < twos; i++) {
            if (sum % m == 0) {
                System.out.println(sum);
                return;
            }
            sum++;
        }
        System.out.println(-1);
    }
}
