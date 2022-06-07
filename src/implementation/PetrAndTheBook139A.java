package implementation;

import java.util.Scanner;

public class PetrAndTheBook139A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pg = sc.nextInt();
        int total = 0;
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        while (total < pg) {
            total += arr[count++];
            if (total >= pg) {
                System.out.println(count);
                return;
            }
            if (count >= 7) {
                count = 0;
            }
        }

    }
}
