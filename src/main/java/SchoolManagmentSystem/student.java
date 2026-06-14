package SchoolManagmentSystem;

import java.util.Scanner;

public class student extends person {

    private int grade;

    private static final Scanner scanner = new Scanner(System.in);

    private static person readPersonInfo() {
        System.out.println("Enter first name");
        String firstname = scanner.nextLine();
        System.out.println("Enter last name");
        String lastname = scanner.nextLine();
        System.out.println("Enter your job");
        String job = scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        System.out.println("Enter your phone number");
        String phone_number = scanner.nextLine();
        System.out.println("Enter your ID");
        String ID = scanner.nextLine();
        System.out.println("Enter your grade");
        int grade = scanner.nextInt();
        System.out.println("Enter student gender F/M");
        char gender = scanner.next().charAt(0);

        return new person(firstname, lastname, job, ID, gender, email, phone_number);
    }

    public student(int grade) {
        this(grade, readPersonInfo());

    }

    private student(int grade, person temp) {
        super(temp.getFirstname(),
                temp.getLastname(),
                temp.getJob(),
                temp.getEmail(),
                temp.getGender(),
                temp.getPhone_number(),
                temp.getId());
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 100)
            this.grade = grade;
        else
            System.out.println("grade must be between 1 - 100");
    }

    public int getGrade() {
        return grade;
    }


}
