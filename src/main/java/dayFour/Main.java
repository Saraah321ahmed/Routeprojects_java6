package dayFour;

public class Main {
    //static void main(String[] args)
    void main(String[] args) {  // لو main class كان static لازم اي class هعمله فيه يكون static
        sum s = new sum();
        s.sum2numbers(40, 10);
        s.sum2numbers(70, 120);
        sarah();

    }

    //public static void sarah()
    public void sarah() { // void معناها مش بترجغ قيمة
        System.out.println("hello");
    }
}
