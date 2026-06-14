package dayOne;

public class Firstprogram {
public static void main(String[] argsing)
{
System.out.println("Hello world");

/*
String firstname = "sarah";
String x = "2+2";
System.out.println(x);
String X = "10";
String y = "15";
System.out.println(X+y);
 */
    int x = 1;
    int y = 2;
    System.out.println("sum of x + y = " + x+y); //problem num

    System.out.println("sum of x + y = " + (x+y));

    float f = 4.75f;
    System.out.println(f);

    double d = 789.67;
    double l = 75;
    System.out.println(d);
    System.out.println(l);

    String firstname = "Sarah";
    String lastname = "Ahmed" ;
    String Fullname = firstname + " " + lastname ;
    float age = 24.5f;
    String dataOfBirth = "01-09-2001";
    String Job_Title = "Testing Engineer";
    double income = 20.5;
    double tax = income * 0.15;
    double netsalary = income - tax;

    System.out.println("Hello My name is :" + Fullname +
     "\n" + "my Date Of Birth is :" + dataOfBirth + "\n" +
            "my age is :" + age + "\n" + "my job is :" + Job_Title +
            "\n" + "my income is :" + (income -tax));

System.out.println("------------------------------------------------------");

System.out.printf("Hello My name is : %s%n" + "My Date Of Birth is : %s%n"
+ "my age is : %s%n" + "my job is : %s%n" + "my income is : %s%n" ,
        Fullname, dataOfBirth , age , Job_Title , netsalary) ;

}
}