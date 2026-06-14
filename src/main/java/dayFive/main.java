package dayFive;

public class main {
    static void main(String[] args) {
        personconstructor p1 = new personconstructor();
        personconstructor p2 = new personconstructor("sarah", 24, 'f');
        p2.printDate();

        System.out.println("------------------------------------------------");

        bankAccount b1 = new bankAccount(-8);
        b1.deposit(500);
        b1.getBalance();

        System.out.println("------------------------------------------------");

        student s = new student("sarah", 9);
        s.getGrade();

        System.out.println("------------------------------------------------");

        dog d1 = new dog();
        d1.eat();
        d1.bark();

        System.out.println("------------------------------------------------");

        car c1 = new car();
        bike bi1 = new bike();
        c1.start();
        c1.honk();
        bi1.start();
        bi1.ringBall();


        System.out.println("------------------------------------------------");

        mathUtils m = new mathUtils();
        m.add(6, 9);
        m.add(23, 54.6);

        System.out.println("------------------------------------------------");

        shape[] shapes = {new circle(), new triangle(), new square()};
        for (shape sh : shapes) {
            sh.draw();
        }

    }
}
