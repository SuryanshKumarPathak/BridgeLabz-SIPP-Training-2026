import java.util.Scanner;

public class FactorialFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid Input");
        } else {

            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " = " + factorial);
        }

        sc.close();
    }
}