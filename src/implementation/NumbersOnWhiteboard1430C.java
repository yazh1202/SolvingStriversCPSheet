package implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersOnWhiteboard1430C {
    //Pure,Shear Bruteforce using two arraylists
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        for (int i = 0; i < tc; i++) {
//            int N = sc.nextInt();
//            ArrayList<Integer> ar = new ArrayList<>();
//            ArrayList<Integer> ar2 = new ArrayList<>();
//            for (int j = 1; j <= N; j++) {
//                ar.add(j);
//                ar2.add(j);
//            }
//            for (int j = 1; j < N; j++) {
//                int a = ar.get(ar.size() - 1);
//                int b = ar.get(ar.size() - 2);
//                int newNum = ((a + b + 1) / 2);
//                ar.remove(ar.size() - 1);
//                ar.remove(ar.size() - 1);
//                ar.add(newNum);
//            }
//            System.out.println(ar.get(0));
//            for (int j = 1; j < N; j++) {
//                int a = ar2.get(ar2.size() - 1);
//                int b = ar2.get(ar2.size() - 2);
//                int newNum = ((a + b + 1) / 2);
//                System.out.print(ar2.remove(ar2.size() - 1) + " ");
//                System.out.println(ar2.remove(ar2.size() - 1));
//                ar2.add(newNum);
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int N = sc.nextInt();
            System.out.println(2);
            for (int j = 1; j < N; j++) {
                if (j <= 2) {
                    System.out.print((N - j) + " " + (N));
                } else {
                    System.out.print((N - j) + " " + (N - j + 2));
                }
                System.out.println();
            }
        }
    }
}
