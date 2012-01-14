
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */
import java.util.Scanner;
import java.util.Arrays;

public class Plane {

    private PlaneSeat[] seat;
    private int numEmptySeat;
    private static int NUM_OF_SEATS = 12;

    public Plane() {

        // Declare and init NUM_OF_SEATS PlaneSeats and set NUM_OF_SEATS EmptySeats
        seat = new PlaneSeat[NUM_OF_SEATS];
        numEmptySeat = NUM_OF_SEATS;

        // Load in the empty seats
        for (int i = 0; i < seat.length; i++) {
            // Since I want seat number to start with 1 and not 0, add 1 to i
            seat[i] = new PlaneSeat(i + 1);
        }
    }

    public void sortSeats() {

        // Since PlaneSeat is a comparable object, can just sort
        Arrays.sort(seat);

    }

    public void showNumEmptySeats() {

        // Display number of empty seats
        System.out.println("There are " + numEmptySeat + " empty seats");


    }

    public void showEmptySeats() {


        System.out.println("The following seats are empty: ");

        // Loop and print empty seats
        for (int i = 0; i < seat.length; i++) {
            if (!seat[i].isOccupied()) {
                System.out.println("SeatID " + seat[i].getSeatID());
            }
        }

        System.out.println();

    }

    public void showAssignedSeat() {

        System.out.println("Seat assignments: ");

        // Loop and print seat assignments
        for (int i = 0; i < seat.length; i++) {
            if (seat[i].isOccupied()) {
                System.out.println("SeatID " + seat[i].getSeatID() + " assigned to CustomerID " + seat[i].getCustomerID());
            }
        }

    }

    public void assignSeat() {

        // Declare Variables
        int seatID, custID;
        Scanner sc = new Scanner(System.in);

        System.out.println("Assigning Seat ..");

        // Get Seat ID
        System.out.print("Please Enter SeatID: ");
        seatID = sc.nextInt();

        // Get Customer ID
        System.out.print("Please Enter Customer ID: ");
        custID = sc.nextInt();

        // Check if seat is free        
        for (int i = 0; i < seat.length; i++) {
            if (seat[i].getSeatID() == seatID) {

                if (seat[i].isOccupied()) {

                    // Prompt error message
                    System.out.println("Seat already assigned to a customer.");

                } else {

                    // Seat is free, can assign to Customer
                    seat[i].assign(custID);

                    // Decrement
                    numEmptySeat--;

                    System.out.println("Seat Assigned!");

                }

                return;

            }
        }

    }

    public void unAssignSeats() {
        int seatID;
        Scanner sc = new Scanner(System.in);

        System.out.println("Unassigning Seat ..");

        // Get Seat ID
        System.out.print("Please Enter Seat ID: ");
        seatID = sc.nextInt();


        // Check if seat is free
        for (int i = 0; i < seat.length; i++) {
            if (seat[i].getSeatID() == seatID) {

                if (seat[i].isOccupied()) {


                    // Seat is free, can assign to Customer
                    seat[i].unAssign();

                    // Increment
                    numEmptySeat++;


                    // Prompt error message
                    System.out.println("Seat Unassigned!");

                } else {

                    System.out.println("Seat not occupied.");


                }


                return;

            }
        }

    }
}
