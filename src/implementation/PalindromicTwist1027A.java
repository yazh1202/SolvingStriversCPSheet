package implementation;

import java.util.Scanner;

import static java.lang.System.in;

public class PalindromicTwist1027A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int tc = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < tc; i++) {
            int len = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            checkString(str);
        }
    }

    //Using the fact that the characters can only vary +1 or -1 and checking for each combination
    private static void checkString(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            char c = ch[i];
            char e = ch[ch.length - i - 1];
            char f1 = (char) (c + 1);
            char f2 = (char) (c - 1);
            char e1 = (char) (e + 1);
            char e2 = (char) (e - 1);
            if (c == e) {
                continue;
            }
            if (f1 != e1 && f1 != e2 && f2 != e1 && f2 != e2) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
