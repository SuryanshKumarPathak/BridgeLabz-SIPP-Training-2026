import java.util.Scanner;

public class MultiplesBelow100While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {

            System.out.println("Invalid Input");

        } else {

            int multiple = number;

            System.out.println("Multiples of " + number + " below 100:");

            while (multiple < 100) {

                System.out.println(multiple);
                multiple += number;

            }

        }

        sc.close();
    }
}