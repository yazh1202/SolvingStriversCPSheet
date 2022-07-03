package math;

import java.util.Scanner;

// Look out for ceilings and floors
public class FloorNumber1426A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            double n = sc.nextDouble();
            double x = sc.nextDouble();
            if (n == 1 || n == 2) {
                System.out.println(1);
            } else {
                //Simple formula based solution
                System.out.println((int) Math.ceil((n - 2) / x) + 1);
            }
        }
    }

    static void naiveSolution(int n, int x) {
        //Naive O(N) Solution
        int floor = 2;
        int ind = 3;
        while (ind != n) {
            if ((ind - 2) % x == 0) {
                floor++;
            }
            ind++;
        }
        System.out.println(floor);
    }

}
