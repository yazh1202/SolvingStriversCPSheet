package implementation;

import java.util.Scanner;

public class StringTask118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cr = s.toCharArray();
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (cr[i] == 'A' || cr[i] == 'I' || cr[i] == 'O' || cr[i] == 'U' || cr[i] == 'E' || cr[i] == 'Y' ||
                    cr[i] == 'a' || cr[i] == 'i' || cr[i] == 'o' || cr[i] == 'u' || cr[i] == 'e' || cr[i] == 'y') {
                continue;
            }
            str.append(".");
            if (cr[i] >= 'A' && cr[i] <= 'Z') {
                str.append(Character.toLowerCase(cr[i]));
                continue;
            }
            str.append(cr[i]);
        }
        System.out.println();
        switchTry(s);
    }

    //Using Switch case to solve the problem
    public static void switchTry(String s) {
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a':
                    continue;
                case 'i':
                    continue;
                case 'o':
                    continue;
                case 'u':
                    continue;
                case 'e':
                    continue;
                case 'A':
                    continue;
                case 'I':
                    continue;
                case 'O':
                    continue;
                case 'U':
                    continue;
                case 'E':
                    continue;
                case 'Y':
                    continue;
                case 'y':
                    continue;
                default:
                    res.append(".");
                    if (c >= 'A' && c <= 'Z') {
                        res.append(Character.toLowerCase(c));
                    } else {
                        res.append(c);
                    }
            }
        }
        System.out.println(res);
    }
}
