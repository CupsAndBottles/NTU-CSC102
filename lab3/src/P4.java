
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */

import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        // Declare variables
        int height;
        String output;

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);

        // Read length
        System.out.println("Please enter a height: ");
        height = sc.nextInt();


        // Validate. Reject if length is < 1
        if (height < 1) {
            System.out.println("Error input!!");
            return;
        }


        // Generate output
        output = ""; // Reset output to original

        for (int i = 1; i <= height; i++) {
            // To determine if should output 'AA' or 'BB'
            if (i % 2 == 1) {
                output = "AA" + output; // Prepend 'AA'
            } else {
                output = "BB" + output; // Prepend 'BB'
            }

            System.out.println(output); // Print and Go to next line
        }

        

    }

}
