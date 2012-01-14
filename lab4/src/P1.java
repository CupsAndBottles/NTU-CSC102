
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        do {

           System.out.println("Perform the following methods:");
           System.out.println("1: miltiplication test");
           System.out.println("2: quotient using division by subtraction");
           System.out.println("3: remainder using division by subtraction");
           System.out.println("4: count the number of digits");
           System.out.println("5: position of a digit");
           System.out.println("6: extract all odd digits");
           System.out.println("7: quit");
           
           choice = sc.nextInt();

           switch (choice) {
             case 1: 
                 mulTest();
                 break;
            case 2:
                int m, n;

                // Get user input
                System.out.print("M : ");
                m = sc.nextInt();
                System.out.print("N : ");
                n = sc.nextInt();

                System.out.println(m + "/" + n + "=" + divide(m, n));
                System.out.println();
                System.out.println();
                break;
                
            case 3: /* add modulus() call */
                 break;
            case 4: /* add countDigits() call */
                 break;
            case 5: /* add position() call */
                 break;
            case 6: /* add extractOddDigits() call */
                 break;
            case 7: System.out.println("Program terminating ....");
           }

        } while (choice < 7);
        
    }

    // Gets a ramdomly generated int number
    private static int getRandomIntNumber() {
        return (int) (Math.random() * 10);
    }

    private static void mulTest() {

        Scanner sc = new Scanner(System.in);
        int numOfCorrectAnswers = 0;
        
        for (int i = 0; i < 5; i++) {

            int randNum1, randNum2, correctAnswer, userAnswer;

            // Get random numbers;
            randNum1 = getRandomIntNumber();
            randNum2 = getRandomIntNumber();

            // Compute correct result
            correctAnswer = randNum1 * randNum2;

            // Show user the question
            System.out.print("How much is " + randNum1 + " times " + randNum2 + "? ");

            // Get user input
            userAnswer = sc.nextInt();


            // Check if answer is correct
            if (userAnswer == correctAnswer) {
                numOfCorrectAnswers++;
            }
            
        
        }

        System.out.println(numOfCorrectAnswers + " out of 5 are correct.");
        System.out.println();
        System.out.println();
        

    }

    private static int divide(int m, int n) {

        int numOfSubtractions = 0, remainder = m;

        while(remainder >= n) {
            remainder -= n;
            numOfSubtractions++;
        }

        return numOfSubtractions;
        
    }

}


