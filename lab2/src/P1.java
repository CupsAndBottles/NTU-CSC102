/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp101604
 */

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        // Declare variables
        int xcoord, ycoord;
        String quadrant = "";

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);
        
        // Read x coordinate
        System.out.println("Please enter x coordinate: ");
        xcoord = sc.nextInt();

        // Read y coordinate
        System.out.println("Please enter y coordinate: ");
        ycoord = sc.nextInt();


        // Check which quad point is on
        if (xcoord == 0 && ycoord == 0) { // Test for origin condition
            quadrant = "origin";
        } else if (xcoord >= 0 && ycoord >= 0) { // Quad 1 scenario
            quadrant = "quadrant 1";
        } else if (xcoord < 0 && ycoord > 0) { // Quad 2 scenario
            quadrant = "quadrant 2";
        } else if (xcoord <= 0 && ycoord <= 0) { // Quad 3 scenario
            quadrant = "quadrant 3";
        } else { // All else in quad 4
            quadrant = "quadrant 4";
        }


        // Show output
        System.out.println("(" + xcoord + "," + ycoord + ") - " + quadrant);


    }

}

/*
 else if (xcoord == 0) {   // Test for quadrant if on x axis

            // Test for y
            if (ycoord > 0) {
                quadrant = "quadrant 1";
            } else {
                quadrant = "quadrant 3";
            }

        } else if (ycoord == 0) {   // Test for quadrant if on y axis

            // Test for x
            if (xcoord > 0) {
                quadrant = "quadrant 1";
            } else {
                quadrant = "quadrant 3";
            }

        }
 * 
 */