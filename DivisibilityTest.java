



/*This java program enables the user to


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
