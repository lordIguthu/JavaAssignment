/*This java program creates a Simple Calculator which helps the user perform the basic operations
The user is able to enter the figures they would like to have computed as well as the operator to be used.
This is possible as the program asks for user input.
It then displays the output on the screen.
The program is however limited to a few operators ( +, -, /, * ) as it is just a simple calculator.
*/



//Import a scanner class to read input from the user.
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

//Add a scanner object to read input from the user
        Scanner userinput = new Scanner(System.in);

//Ask the user to write the first number
        System.out.println("Enter the first number: ");
        double firstnumber = userinput.nextDouble();

//Ask the user to write the operator
        System.out.println("Enter an operation (+, -, *, /): ");
        char operator = userinput.next().charAt(0);

//Ask the user to write the second number
        System.out.println("Enter the second number: ");
        double secondnumber = userinput.nextDouble();

//Declare a variable to store the answer given after the calculation is done
        double answer;

//Do the calculation as per the operator given by the user
        switch (operator) {
            case '+':
                answer = firstnumber + secondnumber;
                break;
            case '-':
                answer = firstnumber - secondnumber;
                break;
            case '*':
                answer = firstnumber * secondnumber;
                break;
            case '/':
                answer = firstnumber / secondnumber;
                break;  
        }

//Write the answer to the calculation done
        System.out.println("Result: " +answer);
    }
}
