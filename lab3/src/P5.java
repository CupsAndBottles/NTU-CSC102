
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */

import java.util.Scanner;


public class P5 {

    public static void main(String[] args) {

        // Declare variables
        double x, tempCalc, result, sign = -1.0; // sign starts with subtraction, after each operation, just flip the sign

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);

        // Read length
        System.out.println("Please enter the value of x: ");
        x = sc.nextDouble();


        // Formula pattern is (x - x power of 3..19 / 3..19 odd numbers with alternating + and - signs (starting with -)

        result = x;
        for (int i = 3; i <= 19; i += 2) {

            tempCalc = Math.pow(x, i)/i; // result of current calculation

            // Get result by adding the (either positive or negative) multiplication of tempCalc
            result += sign * tempCalc;

            // Flip the sign so the next op is the reverse
            sign = -sign;

        }

        // Display result
        System.out.println(result);
        

    }

}
