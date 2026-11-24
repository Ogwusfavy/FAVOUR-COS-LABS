//Ogwuche Favour Ehi
//CIS/CSC/24/023

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Display the length
        System.out.println("Length: " + sentence.length());

        // Check that the sentence is not empty
        if (!sentence.isEmpty()) {
            System.out.println("First character: " + sentence.charAt(0));

            System.out.println("Last character: "
                    + sentence.charAt(sentence.length() - 1));
        } else {
            System.out.println("The sentence is empty.");
        }

        // Convert the sentence to uppercase and lowercase
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());

        input.close();
    }
}
