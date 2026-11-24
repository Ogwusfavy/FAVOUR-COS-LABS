//Ogwuche Favour Ehi
//CIS/CSC/24/023

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RobustFile {
    public static void main(String[] args) {

        // Specify the file to read
        File file = new File("scores.txt");

        // Check whether the file exists
        if (!file.exists()) {
            System.out.println("Sorry, the file 'scores.txt' was not found.");
            System.out.println("Please make sure the file exists in the correct folder.");
            return;
        }

        // Read the file if it exists
        try {
            Scanner input = new Scanner(file);

            System.out.println("File contents:");

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the file could not be opened.");
        }
    }
}
