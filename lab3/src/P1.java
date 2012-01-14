/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        // Declare variables
        char inputChar;
        int ASCIIref;

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);

        do {

            // Read char
            System.out.println("Please enter a char or '#' to quit: ");
            inputChar = sc.nextLine().toLowerCase().charAt(0); // Grab just the first character and convert to lowercase

            ASCIIref = (int)inputChar; // cast to int

            // Check char value in int (reference : http://nemesis.lonestar.org/reference/telecom/codes/ascii.html
            if (ASCIIref >= 48 && ASCIIref <= 57) { // Check Digits
                System.out.println("digit");
            } else if (ASCIIref == 97 ||ASCIIref == 101 || ASCIIref == 105 ||ASCIIref == 111 || ASCIIref == 117) { // Check just lowercase vowels  since converted to lowercase above
                System.out.println("vowel");
            } else if (ASCIIref == 35) { // char '#' to terminate
                System.out.println("program terminated.");
            } else {
                System.out.println("neither");
            }


        } while(inputChar != '#');


 
    }

}
