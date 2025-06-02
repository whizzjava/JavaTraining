package assignments.akhil.streams.intermediate;

import java.util.List;
import java.util.stream.Stream;

public class MergeTwoLists {

    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6);
        List<Integer> l2=List.of(7,8,9,10);
        Stream.concat(l.stream(),l2.stream()).forEach(System.out::println);

    }
}
