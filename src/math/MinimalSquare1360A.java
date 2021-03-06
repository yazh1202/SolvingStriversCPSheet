package math;//package math;
//
//import java.util.Scanner;
//
////When looking to mininze anything, think of how to minimize best before writing code
//public class MinimalSquare1360A {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int tc = sc.nextInt();
//        for (int i = 0; i < tc; i++) {
//            int l = sc.nextInt();
//            int b = sc.nextInt();
//            int max = Math.max(l, b);
//            int min = Math.min(l, b);
//            int side = Math.max(max, 2 * min);
//            System.out.println(side * side);
//        }
//
//    }
//}

import java.io.*;
import java.util.*;

public class MinimalSquare1360A {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        FastWriter fw = new FastWriter();
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int l = sc.nextInt();
            ArrayList<Integer> feven = new ArrayList<>();
            int odds = 0;
            for (int j = 0; j < 2 * l; j++) {
                int inpt = sc.nextInt();
                if (inpt % 2 == 0) {
                    int count = 0;
                    while (inpt % 2 != 1) {
                        inpt /= 2;
                        count++;
                    }
                    feven.add(count);
                } else {
                    odds++;
                }
            }
            int evens = feven.size();
            if (evens == odds) {
                System.out.println();
                System.out.println(0);
            } else if (evens < odds) {
                System.out.println((odds - evens) / 2);
            } else {
                Collections.sort(feven);
                int ops = 0;
                int diff = evens - odds;
                while (diff-- > 0) {
                    ops += feven.get(0);
                    feven.remove(0);
                }
                System.out.println(ops);
            }
        }
    }
}

