package math;

import java.util.Scanner;

public class Elephant617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        if (tc <= 5) {

            System.out.println(1);

            return;

        }

        int steps = tc / 5;

        if (tc % 5 != 0) {

            steps++;

        }

        System.out.println(steps);
    }
}
