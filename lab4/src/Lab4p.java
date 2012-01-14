
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */
import java.util.Scanner;

public class Lab4p {

    public static void main(String[] args) {

        // Declare required parameters
        int choice; // For menu
        int m, n;   // For operations

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    mulTest();
                    break;

                case 2:

                    // Get user input
                    System.out.print("M : ");
                    m = sc.nextInt();
                    System.out.print("N : ");
                    n = sc.nextInt();

                    // Display output with extra new line for readability
                    System.out.println(m + " / " + n + " = " + divide(m, n));
                    System.out.println();
                    System.out.println();
                    break;

                case 3:

                    // Get user input
                    System.out.print("M : ");
                    m = sc.nextInt();
                    System.out.print("N : ");
                    n = sc.nextInt();

                    // Display output with extra new line for readability
                    System.out.println(m + " % " + n + " = " + modulus(m, n));
                    System.out.println();
                    System.out.println();
                    break;

                case 4:

                    // Get user input
                    System.out.print("n : ");
                    n = sc.nextInt();

                    // Check that input is not negative
                    if (n <0) {
                        // Display error output
                        System.out.print(" Count = Error input!!");
                    } else {

                        // n is positive, display expected
                        System.out.print(" Count = " + countDigits(n));
                    }

                    // Display extra new line for readability
                    System.out.println();
                    System.out.println();
                    break;

                case 5:

                    // Get user input
                    System.out.print("n : ");
                    m = sc.nextInt();
                    System.out.print("digit : ");
                    n = sc.nextInt();

                    // Display output with extra new line for readability
                    System.out.println("position = " + position(m, n));
                    System.out.println();
                    System.out.println();
                    break;

                case 6:

                    // Get user input
                    System.out.print("n : ");
                    long nLong = sc.nextInt();

                    // Check that input is not negative
                    if (nLong < 0) {
                        // Display error output
                        System.out.print("oddDigits = Error input!!");
                    } else {

                        // n is positive, display expected
                        System.out.print("oddDigits = " + extractOddDigits(nLong));
                    }

                    // Display extra new line for readability
                    System.out.println();
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Program terminating ....");

            }

        } while (choice < 7);

    }

    // Gets a ramdomly generated int number
    private static int getRandomIntNumber() {
        return (int) (Math.random() * 10);
    }

    private static void mulTest() {

        // Declare variables
        Scanner sc = new Scanner(System.in);
        int numOfCorrectAnswers = 0;

        // Since 5 questions are asked, set for loop to 5
        for (int i = 0; i < 5; i++) {

            // Declare local variables
            int randNum1, randNum2, correctAnswer, userAnswer;

            // Get random numbers;
            randNum1 = getRandomIntNumber();
            randNum2 = getRandomIntNumber();

            // Compute correct result
            correctAnswer = randNum1 * randNum2;

            // Show user the question
            System.out.print("How much is " + randNum1 + " times " + randNum2 + "? ");

            // Get user input
            userAnswer = sc.nextInt();

            // Check if answer is correct
            if (userAnswer == correctAnswer) {

                // Increment the correct answer count by 1 if correct
                numOfCorrectAnswers++;
                
            }


        }

        // Show results and add empty lines so not so crowded
        System.out.println(numOfCorrectAnswers + " out of 5 are correct.");
        System.out.println();
        System.out.println();


    }

    private static int divide(int m, int n) {

        // Declare required parameters
        int numOfSubtractions = 0, remainder = m;

        while (remainder >= n) {
            remainder -= n; // set the remainder un-divided as remainder = remainder - n
            numOfSubtractions++; // increment the number of subtractions as well
        }

        // Return how many subtractions took place
        return numOfSubtractions;

    }

    public static int modulus(int m, int n) {

        // Declare required parameters
        int remainder = m;

        while (remainder >= n) {
            remainder -= n; // set the remainder un-divided as remainder = remainder - n
        }

        // Return the leftover remainder
        return remainder;

    }

    public static int countDigits(int n) {

        // To simplify things, just taking the int as a string and then return the length property
        return Integer.toString(n).length();
        
    }

    public static int position(int n, int digit) {

        // Set index from left to be the last index of the digit from the string representation of n
        int indexFromLeft = Integer.toString(n).lastIndexOf(Integer.toString(digit));

        if (indexFromLeft == -1) { // digit was not found in n

            // Not found, expected output is -1
            return -1;

        } else {

            // Since we want index from the right, we subtract indexFromLeft from the total length of the string
            return Integer.toString(n).length() - indexFromLeft;
        
        }
        
    }

    public static long extractOddDigits(long n) {


        // First conver to string so we can charAt each digit
        String tempStr = Long.toString(n);
        String outputStr = "";

        
        for (int i = 0; i < tempStr.length(); i++) {

            // Analyse each digit using charAt and if odd ( % 2 = 1), add to string
            if (tempStr.charAt(i) % 2 == 1) {
                outputStr += tempStr.charAt(i);
            }

        }

        // If no odd numbers, string is "", make it -1
        if (outputStr.equals("")) {
            outputStr = "-1";
        }

        // convert the string back into a long and return
        return Long.parseLong(outputStr);
        
    }
}