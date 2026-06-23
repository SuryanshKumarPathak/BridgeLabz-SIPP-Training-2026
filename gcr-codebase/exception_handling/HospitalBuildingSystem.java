// A hospital billing system must never crash. Wrap division-by-zero
// (bills with zero items), array out-of-bounds (invalid patient index),
// and number format exceptions (bad input) with meaningful
// messages. Create a custom InsufficientFundsException for payment
// failures.

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBuildingSystem {
    public static void main(String[] args) {
        try {
            int payment =4000;
            int balance= 10000;
            if (payment > balance) {
                throw new InsufficientFundsException("Payment exceeds available balance.");
            }
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
