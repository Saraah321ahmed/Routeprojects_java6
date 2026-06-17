package daySeven;

public class TextPocess_String {
    static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(4));

        // reference point object

        String a = "sarah";
        String b = "sarah";
        System.out.println(a == b);  // compare Value
        String c = "sarah";  // string c = new string("sarah")
        System.out.println(a == c);
        System.out.println(a.equals(c));  // compare Contact

        String text = "I love java, java is fun";
        String lowercase = text.toLowerCase();
        System.out.println(lowercase);
        String uppercase = text.toUpperCase();
        System.out.println(uppercase);

        System.out.println(text.indexOf('a'));
        System.out.println(text.lastIndexOf('a'));

        System.out.println("--------------------------------------");


        countwords("I love java, java is fun");
        reversetext("I love java, java is fun");
    }


    // Method => count number of words in a text

    public static void countwords(String text) {
        String[] words = text.split(" ");
        int numberofwords = words.length;

        System.out.println("number od words equal: " + numberofwords);
        for (int i = 0; i < numberofwords; i++) {
            System.out.println(words[i]);
        }
    }

    public static void reversetext(String text1) {
        String reverseText = "";
        for (int i = text1.length() - 1; i >= 0; i--) {
            reverseText = reverseText + text1.charAt(i);
        }
        System.out.println(reverseText);


    }
}
