package dayFive;

public class car extends vehical {
    public car() {
        super("BMW", "red", "2026");
    }

    public void honk() {
        System.out.println("this car honks: Beep Beep!");
    }

    @Override
    public void start() {
        System.out.println("The car start with honk");
    }
}
