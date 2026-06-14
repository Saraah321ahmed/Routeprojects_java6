package dayThree;

import java.util.Scanner;

public class AddNumbersDoWhile {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag ;
        do {
            System.out.println("Enter first number");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num2 = sc.nextDouble();
            double sum = num1 + num2;
            System.out.println("The sum is :" + sum);
            System.out.println("Would you like to sum two others numbers \n write true if you want \n write  false if not ");

            flag = sc.nextBoolean();
            if(flag == false)
                System.out.println("Thank you for using this program");
        }
        while (flag);  //طول ما ال while  ب true هيدخل ويعمل ال do لحد ما ال while تبقي false وهيقف
    }
}
