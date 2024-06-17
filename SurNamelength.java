/*This java program prompts the user to write down their surname as well as their current age.Whith the use of the scan method,
it is able to capture the user`s input and perform the necessary computations.The program checks the number of charcters in the 
surname, it also checks if the users age is an odd or even number(through arithmetic computations)*/


//Imports a scanner class to read input from the user.
import java.util.Scanner;

public class SurNameLength {
    public static void main(String[] args) {

//Adds a scanner object to read input from the user
        Scanner usernameandage = new Scanner(System.in);

// Ask the user to write their surname
        System.out.print("Enter your surname: ");

//Reads the  string(surname) entered by the user
        String surname = usernameandage.nextLine();

//Asks the user to write their current age
        System.out.print("Enter your current age: ");

//Reads the  integer(age) entered by the user
        int age = usernameandage.nextInt();

//Calculates the number of characters in the surname
        int surnameLength = surname.length();

//Determines wheather the age is even or odd
        String oddoreven = (age % 2 == 0) ? "even" : "odd";

//Prints the answer
        System.out.println("The number of characters is: " + surnameLength);
        System.out.println("Your current age is an " + oddoreven + " number");
    }
}
