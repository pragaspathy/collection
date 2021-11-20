package com.sample;

import java.util.Scanner;

public class vowels {
    public static void main(String []args){

        char c;
        System.out.println("enter your character : ");
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);

        //System.out.println("vowels is : ");

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println(c + " is a vowel ");
                break;
            default:
                System.out.println("Enter correct character ");
                break;

        }

    }
}
