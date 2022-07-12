package math;

import java.util.Scanner;
//Simple technique to check pairs of swaps using two variables to keep the count
public class EvenArray1367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int l = sc.nextInt();
            int ob = 0;
            int eb = 0;
            for (int j = 0; j < l; j++) {
                int inpt = sc.nextInt();
                if (inpt % 2 != j % 2) {
                    {
                        if (inpt % 2 == 0) {
                            eb++;
                        } else {
                            ob++;
                        }
                    }
                }
                if (ob == eb) {
                    System.out.println(ob);
                } else {
                    System.out.println(-1);
                }

            }
        }
    }
}
