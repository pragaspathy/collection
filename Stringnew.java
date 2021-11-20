package com.sample;

import java.util.Scanner;

public class Stringnew {
    public static void main (String [] args){
        int a, b ,c ,ch;

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.division");
        System.out.println("Enter your choice");
        Scanner in = new Scanner(System.in);
        ch = in.nextInt();
        System.out.println("enter two number : ");
        a = in.nextInt();
        b = in.nextInt();
        switch (ch){
            case 1 :
                c = a+b;
                System.out.println("Addition : " + c);
                break;
            case 2 :
                c = a-b;
                System.out.println("2.Subtraction : " + c);
                break;
            case 3 :
                c= a*b;
                System.out.println("3.Multiplicationss : " + c);
                break;
            case 4 :
                c= a/b;
                System.out.println("4.division : " + c);
                break;
            default:
                System.out.println("invalid selection : " );
                break;


        }
    }
}
