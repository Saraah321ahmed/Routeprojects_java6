package dayThree;

public class BreakAndContinue {
    static void main(String[] args) {
        for(int i = 1 ; i<=10 ; i++) {
            if (i == 5)
                break;
            System.out.println("break" + i);

        }

        for(int i = 1 ; i<=10 ; i++) {
            if (i == 5)
                continue;
            System.out.println("continue" + i);

        }

        for(int i = 1 ; i<=10 ; i--) {
            if (i == -5)
                break;
            System.out.println("break" + i);

        }

    }
}
