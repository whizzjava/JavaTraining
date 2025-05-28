package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample  implements Serializable {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Displaying elements
        System.out.println("Fruits List: " + fruits);

        // Accessing an element
        System.out.println("First fruit: " + fruits.get(0));

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Checking size of the ArrayList
        System.out.println("Total fruits: " + fruits.size());

        // Iterating through the ArrayList
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
