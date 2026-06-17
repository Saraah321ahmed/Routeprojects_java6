package daySeven;

import java.util.Scanner;

public class LinearSearch {

    Scanner sc = new Scanner(System.in);

    String[] fruits = {"apple", "orange", "banana"};
    String target;  // Global field
    boolean isfound = false;

    void search() {
        System.out.println("Enter fruit name ");
        target = sc.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target.toLowerCase())) {
                System.out.println("Your favorite fruit at box: " + fruits[i]);
                isfound = true;
                break;
            }
        }
        if (!isfound)
            System.out.println("Your favorite fruit not available");
    }
}

