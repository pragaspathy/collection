package com.sample;

import java.util.Scanner;

public class swappingnew {
    public static void main(String[] args) {

        int x , y , z ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        x = sc.nextInt();

        System.out.println("enter the seconfd number : ");
        y = sc.nextInt();

        z=x;
        x=y;
        y=z;
        System.out.println("after Swapping " + x + " " +  y);
    }
}
