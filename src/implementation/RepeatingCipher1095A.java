package implementation;

import java.util.Scanner;

public class RepeatingCipher1095A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int i = 0;
        int j = 0;
        StringBuilder res = new StringBuilder("");
        while (i < s.length()) {
            res.append(s.charAt(i));
            j++;
            i += j;
        }
        System.out.println(res);
    }
}
