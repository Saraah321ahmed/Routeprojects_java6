package dayFive;

public class bike extends vehical {

    public bike() {
        super("Yamah", "blue", "2020");
    }

    public void ringBall() {
        System.out.println("The bike rings the ball");
    }

    @Override
    public void start() {
        System.out.println("The bike start with kick");
    }

}
