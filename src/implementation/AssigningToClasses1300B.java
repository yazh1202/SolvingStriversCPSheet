package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AssigningToClasses1300B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 0; i < tc; i++) {
            int l = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < 2 * l; j++) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
//            for (Integer a : arr) {
//                System.out.print(a + " ");
//            }
            System.out.println(arr.get(arr.size() / 2) - arr.get((arr.size() / 2) - 1));
        }

    }
}
