
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */

import java.util.Scanner;


public class P2 {

    static final double US_SG_RATE = 1.82;

    
    // Print out heading of the table
    private static void printHeader() {
            System.out.println("===========================\n");
            System.out.println("S$\tUS$");
            System.out.println("---------------------");
    }

    // Validates input based on startVal, endVal and increment.
    // increment cannot be 0 and startval+increment must be less then endVal
    private static boolean validateInput(int startVal, int endVal, int increment) {
        // Check for error conditions
        if (increment <= 0) {
            System.out.println("Invalid Input. Increment must be > 0.");
            return false;
        } else if (startVal+increment > endVal) {
            System.out.println("Invalid Input, please check that the Starting Value is < Ending Value and increment fits within the range.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        
        // Declare variables
        int startVal, endVal, increment;

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Starting Value: ");
        startVal = sc.nextInt();

        System.out.println("Please enter Ending Value: ");
        endVal = sc.nextInt();

        System.out.println("Please enter Increment: ");
        increment = sc.nextInt();


        // Validate input first
        if (!validateInput(startVal, endVal, increment)) {
            return;
        }
        
        // Using For Loop
        printHeader();

        for (int i = startVal; i <= endVal; i+= increment) {
            System.out.println(i + "\t" + i * US_SG_RATE);
        }

        
        // Using While Loop
        printHeader();

        int i = startVal;
        while (i <= endVal) {
            System.out.println(i + "\t" + i * US_SG_RATE);
            i+= increment;
        }


        // Using Do While Loop
        printHeader();

        i = startVal;
        do {
            System.out.println(i + "\t" + i * US_SG_RATE);
            i+= increment;
        }
        while (i <= endVal);


    }

}
