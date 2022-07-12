package math;

import java.util.Scanner;
// Just check remainders
public class BuyAShovel732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            if ((l * i) % 10 == c || (l * i) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
