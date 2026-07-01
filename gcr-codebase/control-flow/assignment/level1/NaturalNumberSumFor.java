import java.util.Scanner;

public class NaturalNumberSumFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("The number is not a natural number.");
        } else {

            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            int formula = number * (number + 1) / 2;

            System.out.println("Sum using for loop = " + sum);
            System.out.println("Sum using formula = " + formula);

            if (sum == formula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("Results are different.");
            }
        }

        sc.close();
    }
}