import java.io.*;
import java.util.*;

public class TestClass {
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
            if (l % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int len = l / 2;
                for (int j = 1; j <= len; j++) {
                    System.out.print(j * 2 + " ");
                }
                int osum = 0;
                int esum = len * (len + 1);
                int k = 0;
                for (int s = 0; s < len - 1; s++) {
                    osum += 2 * s + 1;
                    System.out.print(2 * s + 1 + " ");
                }
                System.out.print(esum - osum);
                System.out.println();
            }

        }
    }

}
