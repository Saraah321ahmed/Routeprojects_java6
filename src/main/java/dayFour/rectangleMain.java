package dayFour;

public class rectangleMain {
    static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5.5);    //r1 is an object from class Rectangle
        r1.setWidth(5.5);
        double Area1 = r1.calculArea();
        System.out.println("Area of Room1 is " + Area1);


        Rectangle r2 = new Rectangle();
        r2.setLength(10);
        r2.setWidth(10);
        double Area2 = r2.calculArea();
        System.out.println("Area of Room2 is " + Area2);

        System.out.println("----------------------------------------");
        double total = Area1 + Area2;
        System.out.println("Total space of room1 and room2 is " + total);

        //double x = rectangle.calculArea();
        //System.out.println(x);
        //هنا عرفت اخزن القيمة بتاع  area في x علشان data type بتاع ال method  عملتها double مش void

    }
}
