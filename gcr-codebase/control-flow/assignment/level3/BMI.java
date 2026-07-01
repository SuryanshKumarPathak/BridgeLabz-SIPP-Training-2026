import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter Height (cm): ");
        double height = sc.nextDouble();

        double heightInMeter = height / 100.0;

        double bmi = weight / (heightInMeter * heightInMeter);

        System.out.printf("BMI = %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Weight Status : Underweight");
        } else if (bmi < 25) {
            System.out.println("Weight Status : Normal Weight");
        } else if (bmi < 30) {
            System.out.println("Weight Status : Overweight");
        } else {
            System.out.println("Weight Status : Obese");
        }

        sc.close();
    }
}