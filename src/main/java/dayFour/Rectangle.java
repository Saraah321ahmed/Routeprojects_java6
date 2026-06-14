package dayFour;

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);

    // Encapsulation => data hiding , data protection , data security
    // dry => don't repeat yourself

    private double length;  //field
    private double width; //field


    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            System.out.println("Length must be positive");
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0)
            width = width;
        else
            System.out.println("Width must be positive");

    }

    public double getWidth() {
        return width;
    }

    public double calculArea() {
        return width * length;
    }


    /*
    public double calculArea() {
        System.out.println("Enter width of rectangle");
        width = sc.nextDouble();
        System.out.println("Enter length of rectangle");
        length = sc.nextDouble();

        double area = length * width;
        System.out.println("Area of rectangle is " + area);
        return area;
    }

     */

}
