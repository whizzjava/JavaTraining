package collections;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        int sum = 0;
        for (int num : numbers) {
            sum = sum+ num;
        }

        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of values: " + sum);
        System.out.println("Sum of values: " + sum1);
    }
}
