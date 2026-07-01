import java.util.Scanner;

public class GreatestFactorFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 1) {

            System.out.println("Invalid Input");

        } else {

            int greatestFactor = 1;

            for (int i = number - 1; i >= 1; i--) {

                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            System.out.println("Greatest Factor (excluding itself) = " + greatestFactor);
        }

        sc.close();
    }
}