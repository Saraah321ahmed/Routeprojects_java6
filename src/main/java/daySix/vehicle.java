package daySix;

public interface vehicle {

    void start();  //abstract method

    default void stop()  //الحالة الوحيده اللي استخدم فيها ال concrete method اني اخلها default
    {
        System.out.println("Vehicle stop ");
    }

}
