import java.util.Scanner;

public class QualityPoints {

    public static int qualityPoints(double average) {
        if (average >= 90 && average <= 100) return 4;
        else if (average >= 80) return 3;
        else if (average >= 70) return 2;
        else if (average >= 60) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's average (0-100): ");
        double avg = scanner.nextDouble();

        int points = qualityPoints(avg);

        System.out.println("Quality points: " + points);
    }
}