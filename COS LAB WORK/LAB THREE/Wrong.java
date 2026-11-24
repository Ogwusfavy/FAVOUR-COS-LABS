//Ogwuche Favour Ehi
//CIS/CSC/24/023

import java.util.Scanner;

public class Wrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Name: " + fullName);

        input.close();
    }
}

