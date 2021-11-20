package com.sample;

import java.util.Scanner;

public class weekendprograme {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and ill show weekend day ");
        day = sc.nextInt();
        System.out.println(day);
    }

    public static void weekdays(int day){

        switch (day){
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;



            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;
        }
    }
}
