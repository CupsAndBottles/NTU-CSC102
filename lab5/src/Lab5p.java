
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */
import java.util.Scanner;
import java.util.Arrays;

public class Lab5p {

    public static void main(String[] args) {

        int choice;
        int[] array = new int[11];

        // create a Scanner object here
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: initialize");
            System.out.println("2: insert");
            System.out.println("3: remove");
            System.out.println("4: display");
            System.out.println("5: quit");

            // read user input
            System.out.println("Please enter choice (1 - 5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    initialize(array);

                    // Display the array
                    display(array);

                    break;
                case 2:
                    // Get user input
                    System.out.print("Number to insert : ");
                    int numberToInsert = sc.nextInt();

                    insert(array, numberToInsert);

                    // Display the array
                    display(array);

                    break;
                case 3:
                    // Get user input
                    System.out.print("Number to remove : ");
                    int numberToRemove = sc.nextInt();

                    remove(array, numberToRemove);

                    // Display the array
                    display(array);

                    break;
                case 4:
                    display(array);
                    break;
                case 5:
                    System.out.println("Program terminating ....");
            }
        } while (choice != 5);
    }

    public static void initialize(int[] ar) {

        // create a Scanner object here
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter Max 10 integers seperated by ' ' to initialise or '#' to go back to menu: ");
        String input = sc.nextLine();

        // Check for termination condition (Input is -1)
        if (input.equals("#")) {
            return;
        }

        // Split string into an array of integers represented by strings
        String[] tempArr = input.split(" ");

        // Reject if more then 10 integers is to be put in
        if (tempArr.length > 10) {

            // Display error message
            System.out.println("ERROR! You can only enter between 0 and 10 integers.");

            // return so user can see menu again
            return;

        }

        // Everything ok, so now I want to clear the array first.
        // Using fill as redefining the array will create a clone
        Arrays.fill(ar, 0);


        for (int i = 0; i < tempArr.length; i++) {

            // Convert string to int and insert into array
            insert(ar, Integer.parseInt(tempArr[i]));

        }

    }

    public static void insert(int[] ar, int n) {

        // Check if array is full using length of arr - 1
        // Default array lengh is 11, so 10 elements can be stored
        // 11(arr lenght) - 1 >= 10 (array full if first element with total elements stored is equal)
        // used >= instead of == just in case the first data got somehow incremented beyond max
        if (ar[0] >= ar.length - 1) {

            // Display error message
            System.out.println("ERROR! Array is full. Please remove some elements before inserting.");

        } else { // Array not full. YEY!

            // Dump new value n into back of array first. Index of next free element is
            // number of elements + 1
            ar[ar[0] + 1] = n;

            // Sort the array with the new number inserted, ignore the index 0
            // so sort from index 1 to ar[0]+2. Its plus 2 since I want to sort
            // to include the newly added element.
            Arrays.sort(ar, 1, ar[0] + 2);

            // Update number of elements in ar[0]
            ar[0]++;


        }

    }

    public static void remove(int[] ar, int n) {

        // Use binarySearch to find first occurance of n, returns the index
        int indexToDel = Arrays.binarySearch(ar, 1, ar[0]+1, n);

        // Only remove if array has elements and searched number is found (indexToDel >= 1)
        if (ar[0] > 0 && indexToDel >= 1) {

            // Copy rest of array behind deleted element over starting frmo the original element index
            System.arraycopy(ar, indexToDel + 1, ar, indexToDel, ar.length - 1 - indexToDel);

            // Update number of elements in ar[0]
            ar[0]--;

        } else {

            // Display error message
            System.out.println("ERROR! Specified number not found in array.");
        
        }

    }

    public static void display(int[] ar) {

        // Print out elements starting from index 1 to number of elements
        // (stored in ar[0]
        for (int i = 1; i <= ar[0]; i++) {
            System.out.println("[" + i + "]" + " - " + ar[i]);
        }

        System.out.println();

    }
}
