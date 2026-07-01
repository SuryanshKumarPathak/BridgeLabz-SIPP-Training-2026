import java.util.Scanner;

public class NaturalNumberSumWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("The number is not a natural number.");
        } else {

            int i = 1;
            int sum = 0;

            while (i <= number) {
                sum += i;
                i++;
            }

            int formula = number * (number + 1) / 2;

            System.out.println("Sum using while loop = " + sum);
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