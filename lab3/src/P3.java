
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {

        // Declare variables
        int length;
        char display;

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);

        // Read length
        System.out.println("Please enter a length: ");
        length = sc.nextInt();


        // Validate. Reject if length is < 1
        if (length < 1) {
            System.out.println("Error input!!");
            return;
        }


        // Read char
        System.out.println("Please enter a character: ");
        display = sc.next().charAt(0);


        // To buffer input and output
        System.out.println();


        // Use nestled for loop to output the square
        for (int i = 0; i < length; i++){

            for (int j = 0; j < length; j++){
                System.out.print(display); // Prints out the character
            }
            
            // New line
            System.out.println();

        }

               
    }

}
