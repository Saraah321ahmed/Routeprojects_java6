package dayFive;

public class vehical {

    protected String brand;
    protected String color;
    protected String year;

    public vehical(String brand, String color, String year) {
        this.brand = brand;
        this.color = color;
        this.year = year;

        System.out.println("brand is " + brand + " color is " + color + " year is " + year);

    }

    public void start() {
        System.out.println("Vehical start");
    }

}
