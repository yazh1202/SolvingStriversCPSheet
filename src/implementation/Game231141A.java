package implementation;


import java.util.Scanner;

import static java.lang.System.in;

public class Game231141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int count = 0;
        while (b != a) {
            double t1 = (b) / 3;
            double t2 = b / 2;
            if (t1 % a == 0 && t1 != 0) {
                b = b / 3;
            } else if (t2 % a == 0 && t2 != 0) {
                b = b / 2;
            } else {
                System.out.println(-1);
                return;
            }
            if (b % a != 0) {
                System.out.println(-1);
                return;
            }
            count++;
        }
        System.out.println(count);
    }
}
