package implementation;

import java.util.*;

public class KString219A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        if (k == 1) {
            System.out.println();
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        if (s.length() % k != 0) {
            System.out.println(-1);
            return;
        }
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            for (char c : hm.keySet()) {
                if (hm.get(c) % k != 0) {
                    System.out.println(-1);
                    return;
                }
                for (int j = 0; j < hm.get(c) / k; j++) {
                    strb.append(c);
                }
            }
        }
        System.out.println(strb);
    }
}
