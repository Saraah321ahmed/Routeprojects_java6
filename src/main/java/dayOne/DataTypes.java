package dayOne;

public class DataTypes {
    public static void main(String[] args){
        //primitive data types

        int myint = 100; //size 4 bytes
        byte mybyte = 10; //size 1 byte
        short myshort = 30000; //size 2 bytes
        long mylong = 100000L; //size 8 bytes
        float myfloat = 100000.0F; //size 4 bytes
        double mydouble = 1000000.0; //size 8 bytes

        System.out.println("Intger: " + myint);
        System.out.println("byte: " + mybyte);
        System.out.println("short: " + myshort);
        System.out.println("long: " + mylong);
        System.out.println("float: " + myfloat);
        System.out.println("double: " + mydouble);

        char mychar = 'a'; //size 2 bytes
        System.out.println("char: " + mychar);


        boolean mybool = true;
        /*
        false = 0
        true = 1
         */
        System.out.println("bool: " + mybool);  //size 1 byte , by default boolean is false

    }
}

