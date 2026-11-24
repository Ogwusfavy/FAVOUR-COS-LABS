//Ogwuche Favour Ehi
//CIS/CSC/24/023

import java.util.Scanner;

public class EmailValidation {

    // Check whether an email follows the assignment's rules
    public static boolean isValidEmail(String email) {

        // Reject emails containing spaces
        if (email.contains(" ")) {
            return false;
        }

        // Find the position of @
        int atPosition = email.indexOf('@');

        // There must be exactly one @
        if (atPosition == -1 ||
                atPosition != email.lastIndexOf('@')) {
            return false;
        }

        // Find a dot after the @
        int dotPosition = email.indexOf('.', atPosition + 1);

        if (dotPosition == -1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = input.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Email passes the given checks.");
        } else {
            System.out.println("Email does not pass the given checks.");
        }

        input.close();
    }
}
