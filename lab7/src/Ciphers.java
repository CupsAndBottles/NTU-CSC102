
/**
 * 
 * @author hp101604 (JONATHAN SAMRAJ)
 */
import java.util.Scanner;

public class Ciphers {

    // So I can re-arrange the initial string to form a different lookup table
    private String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private char[][] lookupTable = new char[alphabetString.length()][alphabetString.length()];
    private String keyword;

    // To read in input
    Scanner sc = new Scanner(System.in);

    public Ciphers() {

        // Create the table here so I don't need to manually create it myself
        int cur; // cur contails the current indexof for the alphabetString

        // Loop through outer loop (rows)
        for (int x = 0; x < lookupTable.length; x++) {

            // Loop through inner loop (columns)
            for (int y = 0; y < lookupTable.length; y++) {

                // Starting at a new indexOf position each time
                cur = x + y;

                // If cur exceeds length of table, then go back to start
                if (cur >= lookupTable.length) {
                    cur -= lookupTable.length;
                }

                // Fill in the value into the array
                lookupTable[x][y] = alphabetString.charAt(cur);
            }
        }

    }

    public String encrypt(String plaintext) {

        String encryptedText = "";


        for (int i = 0; i < plaintext.length(); i++) {

            // Since plaintext can be longer then keyword, use mod to get accurate
            // and consistant results
            int indexOfKeyword = i % keyword.length();
            char letterOfkeyword = keyword.charAt(indexOfKeyword);
            char letterOfPlaintext = plaintext.charAt(i);

            // Use keyword as row, plaintext as column
            // keyword - 97 as keyword is in lower case
            // plaintext - 97 as plaintext is in lower case
            encryptedText += lookupTable[(int) letterOfkeyword - 97][(int) letterOfPlaintext - 97];

        }
        return encryptedText;
    }

    public String decrypt(String ciphertext) {

        String decryptedText = "";


        for (int i = 0; i < ciphertext.length(); i++) {

            // Since plaintext can be longer then keyword, use mod to get accurate
            // and consistant results
            int indexOfKeyword = i % keyword.length();
            char letterOfkeyword = keyword.charAt(indexOfKeyword);


            // Figure out which column index has the column character
            // keyword - 97 as keyword is in lower case
            int indexOfCharArray = indexOfCharArray(lookupTable[(int) letterOfkeyword - 97], ciphertext.charAt(i));

            // Use keyword as row, plaintext as column


            // p+ 97 as plaintext is in lower case
            decryptedText += (char) (indexOfCharArray + 65);

        }
        return decryptedText;

    }

    public void readInKeyword() {

        // read user input
        System.out.print("Enter a keyword: ");
        keyword = sc.nextLine().toLowerCase();

    }

    public void encryptText() {

        String toEncrypt;

        // Read in input & convert to lowerCase
        System.out.print("Enter a line of text: ");
        toEncrypt = sc.nextLine().toLowerCase();

        // Output plaintext
        System.out.println("\tplaintext = " + toEncrypt);

        // Call encryption routine and output ciphertext
        System.out.println("\tciphertext = " + encrypt(toEncrypt));

    }

    public void decryptText() {

        String toDecrypt;

        // Read in input & convert to upperCase
        System.out.print("Enter a ciphertext: ");
        toDecrypt = sc.nextLine().toUpperCase();

        // Output plaintext
        System.out.println("\tciphertext = " + toDecrypt);

        // Call encryption routine and output ciphertext in lowercase
        System.out.println("\tplaintext = " + decrypt(toDecrypt).toLowerCase());


    }

    public void displayLookupTable() {
        // Loop through outer loop (rows)
        for (int x = 0; x < lookupTable.length; x++) {

            // Loop through inner loop (columns)
            for (int y = 0; y < lookupTable.length; y++) {

                // Fill in the value into the array
                System.out.print("[" + lookupTable[x][y] + "] ");
            }

            System.out.println();
        }

    }

    private int indexOfCharArray(char[] array, char search) {

        // Loop through array to find the index of the searched for char
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                // Return the index immediately
                return i;
            }
        }

        // If can't find, return -1
        return -1;
    }
}
