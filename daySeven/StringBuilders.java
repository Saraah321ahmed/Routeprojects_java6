package daySeven;

public class StringBuilders {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
        sb.append(", My name is Sarah");
        System.out.println(sb);

        sb.insert(5, "\uD83D\uDE0A");
        System.out.println(sb);

        sb.delete(0, 5); // delete from 0 to 5
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.replace(0, 5, "Route".toLowerCase());
        System.out.println(sb);

        System.out.println("-------------------------------------------------");
        addSpace("EgyptianNationalTeamWill playTodayAt 8pm");
    }

    static void addSpace(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch) && i > 0)
                sb.append(" ");
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
