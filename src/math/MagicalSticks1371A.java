package math;

import java.util.Scanner;

//>(1371A,1353A)
//>1. If there are pairs to be made to solve a problem, use two pointer method,
// think about their positions, i.e at ends, beginnings, consecutive,mids etc.
public class MagicalSticks1371A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int j = 0; j < tc; j++) {
            double n = sc.nextDouble();
            System.out.println((int) Math.floor(n / 2));
        }
    }
}
