import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the marks of the five units
        double[] marks = new double[5];

        // Loop to get the marks for each unit
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for unit " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // Calculate the total marks
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }

        // Calculate the average marks
        double average = total / 5;

        // Print the average marks rounded to two decimal places
        System.out.printf("The average marks are: %.2f%n", average);
    }
}
