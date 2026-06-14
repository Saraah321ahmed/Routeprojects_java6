package daySix;

abstract class shape {

    // abstraction: hiding implementation details and showing only the essential behavior

    abstract void draw();

    void info() {
        System.out.println("Shape info: This is a shape");
    }
}
