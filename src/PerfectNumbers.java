import java.util.Scanner;

public class PerfectNumbers {

    public static boolean isPerfect(int number) {
        if (number < 1) return false;

        int sum = 1; // 1 is always a proper divisor

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i && number / i != number) {
                    sum += number / i;
                }
            }
        }

        return sum == number;
    }


    public static void displayFactors(int number) {
        System.out.print("Factors: 1");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(" + " + i);
            }
        }
        System.out.println(" = " + number);
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:\n");
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " is a perfect number. ");
                displayFactors(i);
            }
        }


       //For any value and larger value
        System.out.println("\n--- Challenge: Testing larger number ---");
        System.out.print("Enter your large integer value: ");
        int number = scanner.nextInt();
        if (isPerfect(number)) {
            System.out.print(number + " IS a perfect number! Factors: ");
            boolean first = true;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    if (!first) System.out.print(" + ");
                    System.out.print(i);
                    first = false;
                }
            }
            System.out.println(" = " + number);
        } else {
            System.out.println(number + " is NOT a perfect number.");
        }

    }
}