package math;

import java.util.Scanner;

//For any valid triangle sum of two sides is greater than third side
//for range we need to make sure that we can't check for every value possible
//So we eliminate the chances of non-possibility of triangle by repeating the last two sides
//and making the third side satisfy the criteria as well
public class IchihimeAndTriangle1337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            System.out.println(b + " " + c + " " + c);
        }

    }

}
