
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */
import java.util.Scanner;

public class CiphersApp {

    private static Ciphers c = new Ciphers();

    public static void main(String[] args) {

        // Call readInKeyword method to read initial keyword
        c.readInKeyword();

        int choice;
        // create a Scanner object here
        Scanner sc = new Scanner(System.in);


        // Print menu
        System.out.println("You have the following options:");
        System.out.println("(1) encrypt a plaintext message");
        System.out.println("(2) decrypt a ciphertext message");
        System.out.println("(3) quit the program");

        do {

            // read user input
            System.out.print("Enter the number of your choice => ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    // Call encryption routine
                    c.encryptText();

                    break;
                case 2:

                    // Call decryption routine
                    c.decryptText();

                    break;
                case 3:
                    // Going to terminate
                    System.out.println("Program terminating ...");

                    break;
            }
        } while (choice != 3);


    }
}
