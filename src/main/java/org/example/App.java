/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter the first number: ");
        String Num1 = scan.nextLine();

        System.out.print("Enter the second number: ");
        String Num2 = scan.nextLine();

        System.out.print("Enter the third number: ");
        String Num3 = scan.nextLine();

        // Turn string to int
        int iNum1 = Integer.parseInt(Num1);
        int iNum2 = Integer.parseInt(Num2);
        int iNum3 = Integer.parseInt(Num3);

        // If numbers are the same exit program
        if ((iNum1 == iNum2) || (iNum1 == iNum3) || (iNum2 == iNum3))
        {
            System.out.println( "Please enter different numbers for all 3 inputs." );
            System.exit(0);
        }

        if ((iNum1 > iNum2) && (iNum1 > iNum3))
        {
            System.out.println("The largest number is " +iNum1+ ".");
        }

        else if ((iNum2 > iNum1) && (iNum2 > iNum3))
        {
            System.out.println("The largest number is " +iNum2+ ".");
        }

        else if ((iNum3 > iNum1) && (iNum3 > iNum2))
        {
            System.out.println("The largest number is " +iNum3+ ".");
        }
    }
}
