package dayFive;

public class dog extends animal {

    public void bark() {
        System.out.println("this animal barks");
    }

    @Override
    // هنا هيروح يغير الموجود في eat function اللي في كلاس animal ويطبع اللي انا كتبته 
    public void eat() {
        System.out.println("This animal eats bones");
    }
}
