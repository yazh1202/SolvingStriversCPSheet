package math;

import java.util.HashMap;
import java.util.Scanner;

public class DrinksChoosingGame1195A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Don't really get it, will have to look at it later
        long a = sc.nextLong();

        long b = sc.nextLong();

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        long i = a;

        while (i-- > 0) {

            int s = sc.nextInt();

            if (hm.containsKey(s)) {

                hm.put(s, hm.get(s) + 1);

                continue;

            }

            hm.put(s, 1);

        }

        int cnt = 0;

        int ans = 0;

        for (Integer h : hm.values()) {

            cnt += (h % 2);

            ans += (h / 2) * 2;

        }

        ans += (cnt + 1) / 2;

        System.out.println(ans);
    }
}
