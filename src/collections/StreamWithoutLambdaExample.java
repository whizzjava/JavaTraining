package collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamWithoutLambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using an anonymous inner class instead of lambda
        Predicate<String> filterCondition = new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.startsWith("A");
            }
        };

        // Filtering and printing names using method reference
        names.stream()
             .filter(filterCondition)
             .forEach(System.out::println);
    }
}