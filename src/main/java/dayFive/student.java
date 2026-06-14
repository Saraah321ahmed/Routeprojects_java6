package dayFive;

public class student {
    private final String name;
    private final double grade;


    public student(String name, double grade) {

        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        if (grade < 0 || grade > 100)
            System.out.println("grade must be between 0-100 plz enter valid value");
        else
            System.out.println(" stdent name is " + name + " and grade is " + grade);
        return grade;
    }
}
