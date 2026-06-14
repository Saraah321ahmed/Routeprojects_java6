package dayFive;

public class personconstructor {

    String name;
    int age;
    char gender;

    // constructor => special method in a class that is automatically called when an object is created
    // مش بحط قبله data type


    personconstructor() {

        System.out.println("I'm the default constructor");
    }

    personconstructor(String name, int age, char gender) {     // constructor like setter in Encapsulation
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printDate() {
        System.out.println("my name is " + name + " my age is " + age + " my gender is" + gender);
    }

}
