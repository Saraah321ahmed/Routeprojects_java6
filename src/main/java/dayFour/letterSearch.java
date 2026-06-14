package dayFour;

import java.util.Scanner;

public class letterSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String fullName = sc.nextLine();
        boolean letterFound = false;

        for (int i = 0; i < fullName.length(); i++) {
            char currentLetter = fullName.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'A') {
                letterFound = true;
                System.out.println("This name contain letter A or a");
                break;
            }
        }
        if (!letterFound)
            System.out.println("This name doesn't contain letter A or a");
    }
}
