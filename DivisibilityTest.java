/*This java program enables the user to learn the divisibility test of numbers
between 0 and 9.It incorporates the scanner class and object to enable the usergive the number they would like to have checked.
with the use of loop method it iterates through the numbers 1 to 9 and performs mathematical computations so as to find the 
appropriate answer for the user.The program is also able to print out additional information which give the user additional information*/


//Imports a scanner class to read input from the user.
import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {

//Adds a scanner object to read input from the user
        Scanner userinputint = new Scanner(System.in);

//Asks the user to enter an integer
        System.out.print("Enter an integer: ");


//Reads the integer entered by the user
        int number = userinputint.nextInt();

//Loops through integers from 1 to 9 and check for divisibility
        for (int nobeingchecked = 1; nobeingchecked <= 9; nobeingchecked++) {
            if (number % nobeingchecked == 0) {
                System.out.println("The number " + number + " is divisible by " + nobeingchecked);

//Special case for divisibility by 5
                if (nobeingchecked == 5) {
                    if (number % 10 == 0) {
                        System.out.println("The number " + number + " is divisible by 5 because it ends with a zero.");
                    } else if (number % 10 == 5) {
                        System.out.println("The number " + number + " is divisible by 5 because it ends with a 5.");
                    }
                }
            }
        }
    }
}
