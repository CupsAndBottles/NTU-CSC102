
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */
import java.util.Scanner;

public class PlaneApp {

    public static void main(String[] args) {

        int choice;
        Plane planeObject = new Plane();

        // create a Scanner object here
        Scanner sc = new Scanner(System.in);

        System.out.println("(1) Show number of empty seats");
        System.out.println("(2) Show the list of empty seats");
        System.out.println("(3) Show the list of seat assignments");
        System.out.println("(4) Assign a customer to a seat");
        System.out.println("(5) Remove a seat assignment");
        System.out.println("(6) Exit");

        do {

            // read user input
            System.out.println("\nEnter the number of your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Show number of empty seats
                    planeObject.showNumEmptySeats();

                    break;
                case 2:
                    // Show list of empty seats
                    planeObject.showEmptySeats();

                    break;
                case 3:
                    // Show seat assignments
                    planeObject.showAssignedSeat();

                    break;
                case 4:
                    // Assign customer to seat
                    planeObject.assignSeat();

                    break;
                case 5:
                    // Remove seat assignment
                    planeObject.unAssignSeats();

                    break;
                case 6:
                    // Do nothing. Going to terminate

                    break;
            }
        } while (choice != 6);


    }
}
