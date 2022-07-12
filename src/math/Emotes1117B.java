package math;

import java.util.ArrayList;
import java.util.Scanner;

public class Emotes1117B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // I made a mistake in finding out the first and second maximums

        int n = sc.nextInt();

        int m = sc.nextInt();

        int k = sc.nextInt();

        long first = 0;

        long second = 0;

        long sum = 0;

        int check = 0;

        ArrayList<Long> arrl = new ArrayList<Long>();

        while (n-- > 0) {

            long inp = sc.nextLong();

            if(inp>first){

                second = first;

                first = inp;

            }else if(inp>second){

                second = inp;

            }

        }
// System.out.println(first + " " + second);

        long pairs = (m / (k + 1));

        long total = (pairs * second) + (pairs * first * k);

// Correction for rounding error

        total += (m - (pairs * (k + 1))) * first;

        System.out.println(total);
    }
}
