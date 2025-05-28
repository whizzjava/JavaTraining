package collections;

import java.util.Arrays;
import java.util.List;

public class StreamLambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda to filter names starting with 'A'
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
