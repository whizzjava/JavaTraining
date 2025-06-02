package assignments.akhil.streams.intermediate;

import java.util.List;

public class SortListUsingStreams {

    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,2,4,6,5,7,8,3,4,8,7,5);
        l.stream().distinct().sorted().forEach(System.out::println);
    }
}
