package com.sample;

import java.util.Scanner;

public class programe3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number and it can print multiplication of that number");
        int numb1 = sc.nextInt();

        for (int i = 0 ; i < 500 ; i++){
            System.out.println(numb1 + "x" + (i+1) + "=" + (numb1 * (i+1)) );
        }

    }
}
