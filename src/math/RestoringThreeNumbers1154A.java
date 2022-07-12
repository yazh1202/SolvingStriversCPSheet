package math;

import java.util.Scanner;

public class RestoringThreeNumbers1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Simple eh
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long sum = sc.nextLong();
        System.out.println((sum - a) + " " + (sum - b) + " " + (sum - c));
    }
}
