package dayThree;

import java.util.Scanner;

public class Cashier {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items");
        int quantity = sc.nextInt();
        double total = 0;
        System.out.println("Enter price of each item");

        for(int i =0 ; i < quantity ; i++)
        {
            double itemPrice = sc.nextDouble();
            total += itemPrice;
        }
        System.out.println("Total price for items is : " +total);


    }
}
