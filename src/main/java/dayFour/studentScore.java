package dayFour;

import java.util.Scanner;

public class studentScore {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudent = 3;
        int numOfCourses = 4;
        double total = 0;

        for (int i = 1; i <= numOfStudent; i++) {

            for (int j = 1; j <= numOfCourses; j++) {

                System.out.println("Enter score of course  " + j + " for student " + i);
                double score = sc.nextDouble();

                total += score;
            }
            double avg = total / numOfCourses;
            System.out.println("The avg score of syudent " + i + " is " + avg);
        }

    }
}
