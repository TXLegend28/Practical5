import java.util.Scanner;

public class Minimum3 {

    // Method that returns the smallest of three floating-point numbers
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three floating-point numbers (separated by spaces): ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double smallest = minimum3(num1, num2, num3);

        System.out.printf("The smallest number is: %.2f\n", smallest);

      
    }
}