package daySeven;


public class Array {

    static void main(String[] args) {

        // collection of variables of same types
        // Array: Fixed size - Order by index - Start from zero

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(arr[4]);

        // arr[10] = 8; -> out of bound
        // arr[3] = 6.5 -> must be the same date type

        for (int array : arr) {
            System.out.println(array);
        }

        System.out.println("--------------------------------------");

        arr[0] = 5;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------------------------");

        int[] number = new int[5];
        System.out.println(number[0]);

        number[0] = 5;
        System.out.println(number[0]);

        number[1] = 6;
        System.out.println(number[1]);

        number[1] = 7;
        System.out.println(number[1]); //overriding

        System.out.println("--------------------------------------");

        String[] students = {"Sarah", "Rodyana", "Ahmed", "Yara", "Mohab"};
        for (String stu : students) {
            System.out.println(stu);

        }

        students[1] = "Nour";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("--------------------------------------");

        LinearSearch ls = new LinearSearch();
        ls.search();


    }
}