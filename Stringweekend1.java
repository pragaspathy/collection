package com.sample;

import java.util.Scanner;

public class Stringweekend1 {
    public static void main (String[] args){

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weekend number : ");
        a = sc.nextInt();

        switch (a){
            case 1 :
                System.out.println("monday");
                break;

            case 2 :
                System.out.println("tuesday");
                break;

            case 3 :
                System.out.println("wednesday");
                break;

            case 4 :
                System.out.println("thursday");
                break;

            case 5 :
                System.out.println("friday");
                break;

            case 6 :
                System.out.println("saturday");
                break;

            case 7 :
                System.out.println("sunday");
                break;

            default:
                System.out.println("entered value is incorrect: ");

        }

    }
}
