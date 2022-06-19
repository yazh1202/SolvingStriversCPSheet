package implementation;

import java.util.Scanner;

import static java.lang.System.in;

//Keep It simple
public class DiverseSubstring1073A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int size = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char temp = str.charAt(0);
        for (int i = 1; i < size; i++) {
            char c = str.charAt(i);
            if (temp != c) {
                System.out.println("YES");
                System.out.println(String.valueOf(new char[]{temp, c}));
                return;
            }
            temp = c;
        }

        System.out.println("NO");
    }
}
//OverComplicated Unnecessary code for this problem


//for (int i = 0; i < str.length() - 1; i++) {
//            HashMap<Character, Double> hm = new HashMap<>();
//            char a = str.charAt(i);
//            strb.append(a);
//            hm.put(a, 1.00);
//            for (int j = i + 1; j < str.length(); j++) {
//                strb.append(str.charAt(j));
//                char b = str.charAt(j);
//                if (hm.containsKey(b)) {
//                    hm.put(b, hm.get(b) + 1.00);
//                } else {
//                    hm.put(b, 1.00);
//                }
//                if (hm.size() >= 2) {
//                    boolean is = true;
//                    for (Double s : hm.values()) {
//                        if (s > (double) strb.length() / 2) {
//                            is = false;
//                            break;
//                        }
//                    }
//                    if (is) {
//                        System.out.println("YES");
//                        System.out.println(strb);
//                        return;
//                    }
//                }
//            }
//        }