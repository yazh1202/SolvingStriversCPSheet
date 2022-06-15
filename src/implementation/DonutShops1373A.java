    package implementation;

    import java.util.Scanner;

    public class DonutShops1373A {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            for (int i = 0; i < tc; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                //For first shop to be cheaper
                if (a < c) {
                    System.out.print("1 ");
                } else {
                    System.out.print("-1 ");
                }
                //For Second to be cheaper
                if (c < a * b) {
                    System.out.println(b + " ");
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
