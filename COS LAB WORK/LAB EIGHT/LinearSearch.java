//Ogwuche Favour Ehi
//CIS/CSC/24/023

import java.util.Scanner;

public class LinearSearch {

    // Search for a value and return its index
    public static int indexOf(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {12, 25, 34, 47, 56, 68, 79};

        System.out.print("Enter a number to search for: ");
        int target = input.nextInt();

        int position = indexOf(numbers, target);

        if (position != -1) {
            System.out.println("Number found at index: " + position);
            System.out.println("Position in the array: " + (position + 1));
        } else {
            System.out.println("Number was not found.");
        }

        input.close();
    }
}
