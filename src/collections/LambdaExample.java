package collections;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Implementing add method using a lambda expression
        Calculator calc = (a, b) -> a + b;

        System.out.println("Sum: " + calc.add(5, 3));
    }
}
