package oopProject;

public class bookList {

    double javabookprice = 1500;
    double voisbookprice = 3500;
    double pythonbookprice = 500;

    public String bookFiltration(double price) {
        if (price >= 1000)
            System.out.println("available books for this price are: javabookprice and voisbookprice ");

        else if (price >= 500)
            System.out.println("available books for this price are: javabookprice, voisbookprice and pythonbookprice");

        else
            System.out.println("not available books with this price");

        return "";

    }


}
