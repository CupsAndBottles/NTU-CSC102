
/**
 *
 * @author hp101604 (JONATHAN SAMRAJ)
 */
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Lab8p {

    // To hold the filenames for the big and small output file
    public static String FILENAME_SMALL = "small.txt";
    public static String FILENAME_BIG = "big.txt";

    public static void main(String[] args) {


        // Declare required streams
        BufferedReader br;
        PrintWriter pwSmall, pwBig;


        // Read in lines from file
        // While reading in, open stream to write to 2 files.
        try {


            // Prepare to read in lines from file
            br = new BufferedReader(new FileReader("names.txt"));

            // Prepare to write file (Small)
            pwSmall = new PrintWriter(FILENAME_SMALL);

            // Prepare to write file (Big)
            pwBig = new PrintWriter(FILENAME_BIG);



            // Read in first line, if nothing, inputString is null
            String inputString = br.readLine();

            // Loop through wile inputString is not null (still has things to read)
            while (inputString != null) {

                // Check length of string, if > 5, output to big else output to small
                if (inputString.length() > 5) {

                    // Output to big, add new line char behind
                    pwBig.write(inputString + "\n");

                    // Flush stream to write to file immediately
                    //pwBig.flush();

                } else {

                    // Output to small, add new line char behind
                    pwSmall.write(inputString + "\n");

                    // Flush stream to write to file immediately
                    //pwSmall.flush();
                    
                }


                // Read next line
                inputString = br.readLine();

            }



            // Close all streams
            br.close();
            pwSmall.close();
            pwBig.close();

        } catch (Exception e) {

            // If there's an error, catch it and output to screen.
            System.out.println("Error: " + e);
        }



    }
}
