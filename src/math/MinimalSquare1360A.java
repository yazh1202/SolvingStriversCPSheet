package math;

import java.util.Scanner;

//When looking to mininze anything, think of how to minimize best before writing code
public class MinimalSquare1360A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int l = sc.nextInt();
            int b = sc.nextInt();
            int max = Math.max(l, b);
            int min = Math.min(l, b);
            int side = Math.max(max, 2 * min);
            System.out.println(side * side);
        }

    }
}
