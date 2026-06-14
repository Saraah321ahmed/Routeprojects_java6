package assignment;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("Enter 1 if you want to print Numbers Descending \n " +
                    "2 if you want to Check if numbers Even Or Odd \n" +
                    "3 if you want to check Number Type \n " +
                    "4 if you want to calculate Sum of two numbers \n" +
                    "5 if you want to exit \n");
            num = sc.nextInt();
            if (num == 1) {
                printNumbersDescending method1 = new printNumbersDescending();
                method1.descnum();

            } else if (num == 2) {
                printEvenOrOdd method2 = new printEvenOrOdd();
                method2.evenoddnum();
            } else if (num == 3) {
                checkNumberType method3 = new checkNumberType();
                method3.numtype();
            } else if (num == 4) {
                calculateSum method4 = new calculateSum();
                method4.calsum();
            } else if (num == 5)
                System.out.println("Thank you for using Number Analyzer.");
            else
                System.out.println("Plz enter valid num from 1 to 5");

        }
        while (num > 0);
    }
}

