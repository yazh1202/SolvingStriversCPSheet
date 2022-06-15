package implementation;

import java.util.Scanner;

//Need to understand more
public class Buttons268B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int buttonsFound = 0;
        int pushes = 0;
        while (buttonsFound != tc) {
            pushes += (tc - buttonsFound) * buttonsFound++;
        }
        pushes += tc;
        System.out.println(pushes);

    }
}
