package assignments.akhil.streams.basic;

import java.util.List;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        List<Integer> l= List.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);
        l.stream().distinct().forEach(System.out::println);


    }
}
