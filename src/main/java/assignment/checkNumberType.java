package assignment;

import java.util.Scanner;

public class checkNumberType {
    Scanner sc = new Scanner(System.in);

    public int numtype() {
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if (number == 0)
            System.out.println("Num is zero");
        else if (number > 0)
            System.out.println("Num " + number + " is Positive");
        else
            System.out.println("Num " + number + " is Negative");
        return number;
    }
}

