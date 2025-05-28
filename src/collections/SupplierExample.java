package collections;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> getRandom = () -> Math.random();
        System.out.println("Random Number: " + getRandom.get());
    }
}
