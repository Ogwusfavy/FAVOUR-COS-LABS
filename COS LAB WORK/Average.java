//Ogwuche Favour Ehi
//CIS/CSC/24/023

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter first score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter second score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter third score: ");
        double score3 = input.nextDouble();

        // Calculate the average
        double average = (score1 + score2 + score3) / 3;

        // Display average to one decimal place
        System.out.printf("Average: %.1f%n", average);

        input.close();
    }
}
