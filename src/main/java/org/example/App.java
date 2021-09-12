/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        double taxRate=0.055;

        System.out.print("Enter the price of item 1: ");
        double price1=input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int num1=input.nextInt();
        System.out.print("Enter the price of item 2: ");
        double price2=input.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int num2=input.nextInt();
        System.out.print("Enter the price of item 3: ");
        double price3=input.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int num3=input.nextInt();

        double subtotal=price1*num1+price2*num2+price3*num3;
        double tax=subtotal*taxRate;
        double total=subtotal+tax;

        System.out.printf("Subtotal: $%.02f%n",subtotal);
        System.out.printf("Tax: $%.02f%n", tax);
        System.out.printf("Total: $%.02f%n", total);



    }
}
