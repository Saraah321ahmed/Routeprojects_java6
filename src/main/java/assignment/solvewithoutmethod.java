package assignment;

import java.util.Scanner;

public class solvewithoutmethod {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("------------------------program #1-----------------------------------");
        // print 1 to 10

        for(int i=1 ; i <= 10 ; i++)
        {
            System.out.println(i);
        }

        System.out.println("------------------------program #2-----------------------------------");
        // print Hello message 10 times
        for(int i=1 ; i <= 10 ; i++)
        {
            System.out.println("Hello");
        }



        System.out.println("------------------------program #3-----------------------------------");
        // print only even num between 1 to 10

        for(int i=1 ; i <= 10; i++)
        {
            if(i % 2 ==0)
                System.out.println(i);
        }



        System.out.println("------------------------program #4-----------------------------------");
        // print num from 1 to 10 and specify whether even or odd
        for(int i=1 ; i <= 10; i++)
        {
            if(i % 2 ==0)
                System.out.println("num " + i + " is even");
            else
                System.out.println("num " + i + " is odd");


        }

        System.out.println("------------------------program #5-----------------------------------");
        // print 10 to 1

        for(int i=10 ; i >= 1; i--)
        {
            System.out.println(i);
        }


 */

        System.out.println("-----------------------------------------------------------------");

        int num;
        do {
            System.out.println("Enter 1 if you want to print Numbers Descending \n " +
                    "2 if you want to Check if numbers Even Or Odd \n" +
                    "3 if you want to check Number Type \n " +
                    "4 if you want to calculate Sum of two numbers \n" +
                    "5 if you want to exit \n");
            num = sc.nextInt();
            if (num == 1) {
                for (int i = 10; i >= 1; i--) {
                    System.out.println(i);
                }
            } else if (num == 2) {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0)
                        System.out.println("num " + i + " is even");
                    else
                        System.out.println("num " + i + " is odd");


                }
            } else if (num == 3) {
                System.out.println("Enter the Number");
                int number = sc.nextInt();
                if (number == 0)
                    System.out.println("Num is zero");
                else if (number > 0)
                    System.out.println("Num " + number + " is Positive");
                else
                    System.out.println("Num " + number + " is Negative");

            } else if (num == 4) {
                System.out.println("Enter first number");
                int num1 = sc.nextInt();
                System.out.println("Enter second number");
                int num2 = sc.nextInt();
                int sum = num1 + num2;
                System.out.println("sum of two number = " + sum);
            } else if (num == 5)
                System.out.println("Thank you for using Number Analyzer.");
            else
                System.out.println("Plz enter valid num from 1 to 5");

        }
        while (num > 0);
    }
}


