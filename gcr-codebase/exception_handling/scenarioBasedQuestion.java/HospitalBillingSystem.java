import java.util.Scanner;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void makePayment(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Payment failed: Insufficient Funds.");
        }

        System.out.println("Payment Successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] patientBills = {2000, 3500, 1500};

        try {

            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.print("Enter number of bill items: ");
            int items = Integer.parseInt(sc.nextLine());

            int averageBill = patientBills[index] / items;

            System.out.println("Average Bill = " + averageBill);

            System.out.print("Enter available balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            makePayment(balance, payment);

        } catch (ArithmeticException e) {

            System.out.println("Error: Bill items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {

            System.out.println("Error: Invalid numeric input.");

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }

        sc.close();
    }
}