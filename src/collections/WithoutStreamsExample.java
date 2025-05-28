package collections;

import java.util.Arrays;
import java.util.List;

public class WithoutStreamsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Loop through the list and check for names starting with 'A'
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}
