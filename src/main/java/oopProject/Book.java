package oopProject;

public class Book extends bookList implements product {

    private double price;
    private String Author;
    private String name;
    private String description;
    private int ID;
    private int Bookyear;

    // set
    public void printBook(double price, String Author, String name, int ID, int Bookyear) {
        this.ID = ID;
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.Bookyear = Bookyear;

        if (Bookyear >= 1998)
            System.out.println("Book name is " + name + " Book ID is " + ID + " Book Author is " + Author +
                    " price is " + price + " Book Creation Year is " + Bookyear);

        else
            System.out.println("Books before 1998 are not available");
    }

    public void Bookwithdesc(double price, String Author, String name, int ID, String description, int Bookyear) {
        this.ID = ID;
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.description = description;
        this.Bookyear = Bookyear;

        if (Bookyear >= 1998)
            System.out.println("Book name is " + name + " Book ID is " + ID + " Book Author is "
                    + Author + " price is " + price + " Book description " + description + " Book Creation Year is "
                    + Bookyear);

        else
            System.out.println("Books before 1998 are not available");
    }

    public void priceCategory(double price) {
        System.out.println(bookFiltration(price));
    }

    // get
    @Override
    public String BookName() {
        return name;
    }

    @Override
    public double BookPrice() {
        return price;
    }

    @Override
    public String BookDescription() {
        return description;
    }

    @Override
    public String BookAuthor() {
        return Author;
    }

    @Override
    public int BookID() {
        return ID;
    }

    @Override
    public int BookCreationYear() {
        return Bookyear;
    }

    @Override
    public boolean IsAvailable() {
        return false;
    }

}

