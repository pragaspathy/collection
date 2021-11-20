package com.sample;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numb = sc.nextInt();

        int rev = 0;
        while (numb!= 0){
            rev = (rev*10) +(numb%10);
            numb = numb /10;
        }
        System.out.println("the reverse number is : " + rev);
    }
}
