package implementation;

import java.util.Scanner;

public class CapsLock131A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int j = 0;
        char[] cr = str.toCharArray();
        if (!(cr[0] >= 'A' && cr[0] <= 'Z')) {
            cr[0] = Character.toUpperCase(cr[0]);
            j = 1;
        }
        for (int i = j; i < cr.length; i++) {
            if (cr[i] >= 'A' && cr[i] <= 'Z') {
                cr[i] = Character.toLowerCase(cr[i]);
            } else {
                System.out.println(str);
                return;
            }
        }
        System.out.println(String.valueOf(cr));
    }
}
