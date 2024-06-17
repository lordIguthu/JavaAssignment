/*This java program checks for the multiples of 2, 3 and 7 in the range of 71 to 150.
It uses a for loop to iterate through the range of numbers from 71 to 150.
An if statement is used to check if the current number is a multiple of 2, 3, or 7 using the modulo operator %.
If that is the case(the remaonder is zero), the number is printed.



public class MultipleNumbers {
    public static void main(String[] args) {

//Prints the statement "Multiples of 2, 3, and 7 from 71 to 150: "
        System.out.println("Multiples of 2, 3, and 7 from 71 to 150:");

//Loops through the range from 71 to 150
        for (int rangedigit = 71; rangedigit <= 150; rangedigit++) {


//Checks if the number is a multiple of 2, 3, or 7
            if (rangedigit % 2 == 0 || rangedigit % 3 == 0 || rangedigit % 7 == 0) {

//Prints out the number
                System.out.println(i);
            }
        }
    }
}
