package daySix;

public class main {

    static void main(String[] args) {
        shape s1 = new circle();
        shape s2 = new square();

        s1.draw();
        s2.draw();

        System.out.println("------------------------------------------------");

        vehicle v1 = new car();
        vehicle v2 = new Bike();
        v1.start();
        v2.start();

        System.out.println("------------------------------------------------");


        Animal[] a1 = {new dog(), new cat(), new cow()};
        for (Animal a : a1)
            a.makeSound();

        System.out.println("------------------------------------------------");


        calculator c = new calculator();
        c.add(5, 8);
        c.add(10, 7, 7);
        c.add(7.9, 5.5);

    }
}
