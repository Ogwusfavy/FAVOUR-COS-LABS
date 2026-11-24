//Ogwuche Favour Ehi
//CIS/CSC/24/023

public class PalindromeNumbers {

    // Check whether a number is a palindrome
    public static boolean isPalindrome(int n) {

        int original = n;
        int reversed = 0;

        // Reverse the number
        while (n > 0) {

            int digit = n % 10;

            reversed = reversed * 10 + digit;

            n = n / 10;
        }

        // Compare original and reversed numbers
        return original == reversed;
    }

    public static void main(String[] args) {

        System.out.println("Palindrome numbers from 100 to 999:");

        // Check all three-digit numbers
        for (int i = 100; i <= 999; i++) {

            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
