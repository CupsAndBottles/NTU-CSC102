/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp101604
 */

import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        char input;

        // Init Scanner obj to read input
        Scanner sc = new Scanner(System.in);

        // Read char
        System.out.println("Please input a character: ");
        input = sc.nextLine().charAt(0);

        // Switch statement
        switch(input) {
            case 'A':
            case 'a':
                System.out.println("Action movie fan\n");
                break;

            case 'C':
            case 'c':
                System.out.println("Comedy movie fan\n");
                break;

            case 'D':
            case 'd':
                System.out.println("Drama movie fan\n");
                break;
                
            default :
                System.out.println("Invalid Choice\n");

        }
    }

}
