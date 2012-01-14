/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp101604
 */

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {

        // Declare variables
        double salary;
        int meritpts;
        String grade;

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);

        // Read x coordinate
        System.out.println("Please enter salary: ");
        salary = sc.nextDouble();

        // Read y coordinate
        System.out.println("Please enter merit points: ");
        meritpts = sc.nextInt();


        // Check which quad point is on
        if (salary >= 700 && salary <= 899) { // Grade A

            if (salary <= 799 && meritpts < 20 ){
                grade = "Grade B";
            } else {
                grade = "Grade A";
            }

        } else if (salary >= 600 && salary <= 799) { // Grade B

            if (salary <= 649 && meritpts < 10 ){
                grade = "Grade C";
            } else {
                grade = "Grade B";
            }

        } else if (salary >= 500 && salary < 600) { // Grade C
            grade = "Grade C";
        } else {
            grade = "Unknown Grade";
        }


        // Show output
        System.out.println(grade);


    }
}
