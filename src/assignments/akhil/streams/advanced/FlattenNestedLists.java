package assignments.akhil.streams.advanced;

import java.util.List;

public class FlattenNestedLists {

    public static void main(String[] args) {
        List<List<Integer>> nl=List.of(List.of(1,2,3,4),List.of(5,6,7,8));
//        nl.stream().flatMap(l->l.stream()).forEach(System.out::println);
        nl.stream().flatMap(List::stream).forEach(System.out::println);

    }
}
