package math;

import java.util.Scanner;

public class ParkLighting1358A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N * M % 2 == 0) {
                System.out.println(N * M / 2);
            } else {
                double d = (double) N * M / 2;
                System.out.println((int)(Math.ceil(d)));
            }
        }
    }
}
