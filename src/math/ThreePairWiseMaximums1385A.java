package math;

import java.util.*;
//Weird Problem, doesn't have test cases backing problem statement
public class ThreePairWiseMaximums1385A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            ArrayList<Long> al = new ArrayList<>();
            al.add(a);
            al.add(b);
            al.add(c);
            Collections.sort(al);
            if (a == b && a == c) {
                System.out.println("YES");
                System.out.println(a+" "+a+" "+a);
            } else if (!Objects.equals(al.get(1), al.get(2))) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(al.get(0) + " " + al.get(1) + " " + al.get(1));
            }
        }
    }

    static void solve(long a, long b, long c) {
        if (b == c && c == a) {
            System.out.println("YES");
            System.out.println(a + " " + b + " " + c);
        } else {
            if (a != b && b != c && a != c) {
                System.out.println("NO");
            } else if (a == b) {
                if (c > b) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    System.out.println(a + " " + c + " " + Math.max(c - 1, 1));
                }
            } else if (b == c) {
                if (a > b) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    System.out.println(b + " " + (a) + " " + Math.max(a - 1, 1));
                }
            } else {
                if (c < b) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    System.out.println(a + " " + (b) + " " + Math.max(b - 1, 1));
                }
            }
        }
    }

    static void anotherSolution(long a, long b, long c) {
        long common = -1;
        long other = -1;
        if (a == b) {
            common = a;
            other = c;
        } else if (b == c) {
            common = b;
            other = a;
        } else {
            common = c;
            other = b;
        }
        if (other > common) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(common + " " + other + " " + Math.max(other - 1, 1));
        }
    }
}
