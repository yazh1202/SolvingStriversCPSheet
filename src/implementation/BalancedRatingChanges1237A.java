package implementation;

import java.util.Scanner;

public class BalancedRatingChanges1237A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        double[] arr = new double[tc];
        int minSum = 0;
        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextDouble();
            minSum += Math.floor(arr[i] / 2);
        }
        //Floor always decreases the values, even for negatives, and ceil always increases the values
        //Minimising everything and finding the difference to overcome and then increasing value when needed
        int x = 0;
        int temp = 0;
        for (double d : arr) {
            if (d % 2 == 0) {
                x = (int) (d / 2);
                System.out.println(x);
            } else {
                if (minSum != 0) {
                    x = (int) Math.ceil((d / 2));
                    System.out.println(x);
                    minSum++;
                } else {
                    x = (int) Math.floor(d / 2);
                    System.out.println(x);
                }
            }
            temp += x;
        }
//            System.out.println(temp);
    }
}
