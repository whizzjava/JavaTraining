package assignments.akhil.streams.intermediate;

import java.util.List;

public class FindFirstElmntMatchCondtn {

    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,2,4,6,5,7,8,3,4,8,7,5);
//        System.out.println(l.stream().filter(a->a%2==0).findFirst().get()); //can throw NoSuchElementException
//        if it didn't find any, so
        l.stream().filter(a->a%2==0).findFirst().ifPresent(System.out::println);

    }
}
