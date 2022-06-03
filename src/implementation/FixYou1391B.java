package implementation;

import java.util.Scanner;

public class FixYou1391B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            int count = 0;
            for (int m = 0; m < R; m++) {
                String c = sc.next();
                for (int j = 0; j < C; j++) {
                    if (m == R - 1 && c.charAt(j) == 'D') {
                        count++;
                        continue;
                    }
                    if (j == C - 1 && c.charAt(j) == 'R') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
