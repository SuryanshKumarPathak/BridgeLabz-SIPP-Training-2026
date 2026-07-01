import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();

        if (salary <= 0 || years < 0) {
            System.out.println("Invalid Input");
        } else {

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = 0;
            }

            System.out.println("Bonus Amount = " + bonus);
        }

        sc.close();
    }
}