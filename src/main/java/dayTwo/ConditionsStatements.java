package dayTwo;

import java.util.Scanner;

public class ConditionsStatements {
    static void main(String[] args) {
        // scanner -> allow take input from external source

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age Plz!");
        int Age = sc.nextInt();
        System.out.println("My Age Is : " + Age);


        String voting = Age >= 18 ? "good to vote" : "not good to vote";
        System.out.println(voting);

        if (Age >= 18)
            System.out.println("good to vote");
        else
            System.out.println("not good to vote");

        System.out.println("-------------------------------------------------");
        // program to check even or odd
        
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        if (num >= 0) {
            if (num == 0)
                System.out.println("The number is Zero");
            else if (num % 2 == 0)
                System.out.println("The number " + num + " is even");
            else
                System.out.println("The number " + num + " is odd");

        }
        else
            System.out.println("Negative number is not allowed");

        System.out.println("-------------------------------------------------");


    }
}
