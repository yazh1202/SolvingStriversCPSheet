package implementation;

import java.util.Scanner;

public class MiddleOfTheContest1133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        String end = sc.nextLine();
        //Parsing the string to integer for getting hour and minutes
        int hs = Integer.parseInt(start.substring(0, 2));
        int ms = Integer.parseInt(start.substring(3, 5));
        int he = Integer.parseInt(end.substring(0, 2));
        int me = Integer.parseInt(end.substring(3, 5));
        //Calculating the duration
        int duration = (he * 60 + me) - (hs * 60 + ms);
        //Calculating the hours for the middle of contest
        int hour = ((hs * 60 + ms) + (duration / 2)) / 60;
        //Calculating the minutes for the middle of contest
        int mins = (hs * 60 + ms + (duration / 2)) % 60;
        //Printing using printf leading zeroes when needed
        System.out.printf("%02d:%02d", hour, mins);
    }
}
