package collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaArrayListEx {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("papaya");

//        //print arraylist
//        for(String str: fruits){
//            System.out.println(str);
//        }

        fruits.forEach((str)-> System.out.println(str));
    }
}
