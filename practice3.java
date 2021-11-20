package com.sample;

import java.util.Scanner;

public class practice3 {
    public static void main (String args[]){


        String myname = "windo";
        char ch = myname.charAt(1);

        for (int i = 2; i <= myname.length() ; i++){

            if (ch == myname.charAt(0)){

                System.out.println("the repeated value is : " + ch);
                break;

            }

            else {
                System.out.println("non repeated value is  : " +  ch );
                break;
            }


        }







    }
}
