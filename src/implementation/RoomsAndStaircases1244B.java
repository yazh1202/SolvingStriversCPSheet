package implementation;

import java.util.Scanner;

public class RoomsAndStaircases1244B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < tc; i++) {
            int len = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            calcRooms2(str.toCharArray());
        }
    }

    //Initial approach of moving whenever stairs are reached, doesn't work because doesn't maximise
    static void calcRooms(char[] arr) {
        int sum = 0;
        if (arr[0] == '1' || arr[arr.length - 1] == '1') {
            System.out.println(arr.length * 2);
            return;
        }
        int onec = 0;
        int zc = 0;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '1') {
                onec++;
                sum += 2;
            } else {
                zc++;
                sum += 1;
            }
        }
        System.out.println(onec + " " + zc);
        System.out.println(sum);
    }

    //Taking only one staircase and deciding whether it gives the maximum sum
    //by using the fact that we cannot visit the same room twice.
    // we can only visit the same rooms on the below floor or we can take the staircase and visit
    //the remaining rooms on the floor below

    //The edge cases are if all rooms don't have a staircase, we return the number of rooms in that case

    //If either the first or the last room has a staircase we can visit all the rooms
    static void calcRooms2(char[] arr) {
        int sum1 = 0;
        if (arr[0] == '1' || arr[arr.length - 1] == '1') {
            System.out.println(arr.length * 2);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                sum1 = Math.max(sum1, Math.max(2 * (arr.length - i), 2 * (i + 1)));
            }
        }

        if (sum1 == 0) {
            System.out.println(arr.length);
        } else {
            System.out.println(sum1);
        }
    }
}
