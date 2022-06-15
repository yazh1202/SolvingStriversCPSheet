package implementation;

import java.util.Scanner;

public class NewYearTransportation500A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int tg = sc.nextInt();
        int current = 0;
        if (m == 1 || tg == 1) {
            System.out.println("YES");
            return;
        }
        int pos = 1;
        for (int i = 0; i < m - 1; i++) {
            int N = sc.nextInt();
            if (i + 1 == pos) {
                current = N + i + 1;
                if (current == tg) {
                    System.out.println("YES");
                    return;
                }
                pos = current;
            }
        }
        System.out.println("NO");
    }
}
