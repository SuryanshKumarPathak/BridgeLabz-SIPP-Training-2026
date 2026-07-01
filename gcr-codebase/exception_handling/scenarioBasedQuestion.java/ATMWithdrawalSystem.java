import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(double balance, double requestedAmount) {

        super("Insufficient Balance!");

        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

public class ATMWithdrawalSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance = ₹" + (balance - amount));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("Enter Withdrawal Amount: ₹");
        double amount = sc.nextDouble();

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
            System.out.println("Available Balance : ₹" + e.getBalance());
            System.out.println("Requested Amount : ₹" + e.getRequestedAmount());
        }

        sc.close();
    }
}