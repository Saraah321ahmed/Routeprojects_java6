package dayThree;

import java.util.Scanner;

public class ConditionalStatements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // program to check positive and negative numbers
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num == 0)
            System.out.println("Num is Zero");
        else if (num > 0)
            System.out.println("The num " + num + " is positive");
        else
            System.out.println("The num " + num + " is Negative");

        System.out.println("-------------------------------------------------------");
        //program to check largest of 3 numbers

        System.out.println("Enter first num");
        int num1 = sc.nextInt();
        System.out.println("Enter second num");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd num");
        int num3 = sc.nextInt();
        if (num1 == num2 && num1 == num3)
            System.out.println("The numbers are same and equal " + num1);
            else if (num1 > num2 && num1 > num3)
                System.out.println("Largest number is " + num1);
            else if (num2 > num1 && num2 > num3)
                System.out.println("Larget number is " + num2);
            else
                System.out.println("Largset mumber is " + num3);

        System.out.println("-------------------------------------------------------");

        //program to display day name

        System.out.println("Enter num");
        int daynum = sc.nextInt();
        if(daynum == 1)
            System.out.println("Sunday");
        else if(daynum == 2)
            System.out.println("Monday");
        else if(daynum == 3)
            System.out.println("Tuesday");
        else if(daynum == 4)
            System.out.println("Wednesday");
        else if(daynum == 5)
            System.out.println("Thursday");
       else  if(daynum == 6)
            System.out.println("Friday");
        else if(daynum == 7)
            System.out.println("Saturday");
        else
            System.out.println("Plz enter valid num from 1 to 7");

        System.out.println("-----------------------------------------------------");



        System.out.println("Plz enter day name");
        String dayname = sc.nextLine();
        switch (dayname)
        {
            case "Sunday":
                System.out.println("1");
                break;
            case "Monday":
                System.out.println("2");
                break;
            case "Tuesday":
                System.out.println("3");
                break;
            case "Wednesday":
                System.out.println("4");
                break;
            case "Thursday":
                System.out.println("5");
                break;
            case "Friday":
                System.out.println("6");
                break;
            case "Saturday":
                System.out.println("7");
                break;
            default:
                System.out.println("Plz enter valid name");
        }
    }
}
