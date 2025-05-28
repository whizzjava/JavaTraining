package collections;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum of 5 and 3: " + sum.apply(5, 3));
    }
}
