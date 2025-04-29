package assignments.lohith;

import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter an alphabet character.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }

        scanner.close();
    }
}