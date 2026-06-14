package dayThree;

import java.util.Scanner;

public class EmployeeSalary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hourRate = 15;
        int weeklyWorkingHours = 40;

        System.out.println("Enter your weeekly working hours");
        double empWorkingHours = sc.nextDouble();
        while (empWorkingHours > weeklyWorkingHours || empWorkingHours <= 0)
        {
            System.out.println("Invalid entry plz enter between 1h to 40h");
            System.out.println("Enter your weeekly working hours");
            empWorkingHours = sc.nextDouble();  //stoper
        }
double salary = empWorkingHours * hourRate;
        System.out.println("Your weekly gross salary is : " +salary);
    }
}
