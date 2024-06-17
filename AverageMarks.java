/*This Java program asks the user (student) to enter their marks of the five units
they did last semester, it computes the average and displays it on the screen. 
The average is given in two decimal places.
This is done with the use of features such as the scanner object which reads the users`s input.
Loops and Arrays also come in handy as they shorten the code.*/




//Imports a scanner class to read input from the user.
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

//Adds a scanner object to read input from the user
        Scanner studentmarks = new Scanner(System.in);

//Array to store the marks of the five units
        double[] marks = new double[5];

//Loop to get the marks for each unit
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for unit " + (i + 1) + ": ");
            marks[i] = studentmarks.nextDouble();
        }

//Calculates the total marks
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }


//Calculates the average marks
        double averagescore = total / 5;

//Prints the average marks rounded to two decimal places
        System.out.printf("The average marks are: %.2f%n", averagescore);
    }
}
