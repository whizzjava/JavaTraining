package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store country names and their codes
        Map<String, String> countryCodes = new HashMap<>();

        // Adding key-value pairs to the Map
        countryCodes.put("USA", "US");
        countryCodes.put("India", "IN");
        countryCodes.put("Germany", "DE");
        countryCodes.put("Japan", "JP");

        // Displaying the entire Map
        System.out.println("Country Codes: " + countryCodes);

        // Accessing a value using a key
        System.out.println("Code for India: " + countryCodes.get("India"));

        // Removing an entry
        countryCodes.remove("Germany");
        System.out.println("After removing Germany: " + countryCodes);

        // Checking if a key exists
        System.out.println("Does the map contain 'Japan'? " + countryCodes.containsKey("Japan"));

        // Iterating through the Map
        System.out.println("Iterating through the country codes:");
        for (String country : countryCodes.keySet()) {
            System.out.println(country + " -> " + countryCodes.get(country));
        }
    }
}