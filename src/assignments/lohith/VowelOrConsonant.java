package assignments.lohith;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Correct: Scanner with capital S

        System.out.print("Enter an alphabet: ");
        String input = scanner.next();  // Correct: String with capital S
        char ch = input.charAt(0);       // Get first character

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is a Consonant.");
        }

        scanner.close();
    }
}

