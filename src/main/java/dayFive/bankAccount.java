package dayFive;

public class bankAccount {

    private double balance;

    public bankAccount(double initialBalance) {

        if (initialBalance < 0)
            System.out.println("balance can not be negative. setting balance to 0");

        else
            System.out.println("your initial balance is " + initialBalance);

        balance = initialBalance;

    }

    public void deposit(double amount) {

        if (amount > 0)
            balance += amount;


    }

    public double getBalance() {
        System.out.println("balance is " + balance);
        return balance;
    }

}
