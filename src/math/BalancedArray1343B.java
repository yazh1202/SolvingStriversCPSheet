package math;

import java.util.Scanner;

//Look for patterns in test cases, they make the problem easier
public class BalancedArray1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int l = sc.nextInt();
            if (l % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int len = l / 2;
                for (int j = 1; j <= len; j++) {
                    System.out.print(j * 2 + " ");
                }
                int osum = 0;
                int esum = len * (len + 1);
                int k = 0;
                for (int s = 0; s < len - 1; s++) {
                    osum += 2 * s + 1;
                    System.out.print(2 * s + 1 + " ");
                }
                System.out.print(esum - osum);
                System.out.println();
            }
        }

    }
}
