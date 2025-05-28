package collections;

import java.util.function.Predicate;

public class PredicateLambda {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4)); // true
    }
}
