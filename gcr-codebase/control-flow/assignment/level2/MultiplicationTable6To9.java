import java.util.Scanner;

public class MultiplicationTable6To9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        System.out.println("\nMultiplication Table:");

        for (int i = 6; i <= 9; i++) {

            System.out.println(number + " * " + i + " = " + (number * i));

        }

        sc.close();
    }
}