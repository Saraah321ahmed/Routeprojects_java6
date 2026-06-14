package dayTwo;

public class Operators {
    static void main(String[] args) {
        /*
        int x = 10;
        int y = 20;
        System.out.println(x==y); // == means them have same datatype and value (boolean true or false)
        System.out.println(x = y);
        System.out.println("x = " + x);
        System.out.println(x!=y);


        double a = 15.0;
        int b = 15;
        System.out.println(a==b);
        System.out.println(a!=b);

        */

        System.out.println("--------------------------------------------------------");

        int s = 25;
        int m = 25;
        System.out.println("the value of S = "+s);
        s=s+5;
        s+=5;  //short hand assigment
        System.out.println("The value of S+5 = "+s);
        System.out.println("The value of S+M = " + (s+m));


        s=s-5;
        s-=5;
        System.out.println("the value of S-5 = "+s);

        s=s*5;
        s*=5;
        System.out.println("the value of S*5 = "+s);

        s=s/5;
        s/=5;
        System.out.println("the value of S/5 ="+s);

        int u = 35727464;
        int v = 20;
        System.out.println("the value of U%V = "+ (u%v));


        // Relational Operators -> Binary

        int x = 7;
        int y = 5;
        int a = 3;
        int b = 7;
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        // Logical Operators -> Unary and Binary
        System.out.println("--------------------------------------------------------");

        boolean v1 = true;
        boolean v2 = false;
        System.out.println(v1 && v2);
        System.out.println(v1 || v2);
        System.out.println(x > y && y > a);
        System.out.println(x > y && y > b);
        System.out.println(y > x || a > b);
        System.out.println(y > x && a > b);
        System.out.println(x > a || b < y);

// if condition
        int adbi = 30;
        int almi = 20;
        boolean tamioz = true;
        if(adbi < almi && tamioz)
            System.out.println("ادحل ادبي");
        else
            System.out.println("ادخل علمي");

        System.out.println("--------------------------------------------------------");

        // increment and decrement
        int num = 10;
        System.out.println(num++); //post increment
        System.out.println(++num);

        int n = 5;
        System.out.println(n++);
        System.out.println(n);

        // Ternary Operators
        int z=7 , k=10 , c;
        c= (z > k) ? z : k;
        System.out.println("The gratest value is : " + c);

        /*
        if(z>k)
            c=z;
        else
            c=k;
         */
    }
}
