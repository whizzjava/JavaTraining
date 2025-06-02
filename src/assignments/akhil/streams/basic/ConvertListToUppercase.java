package assignments.akhil.streams.basic;

import java.util.List;
import java.util.stream.Stream;

public class ConvertListToUppercase {


    public static void main(String[] args) {
        List<String> l=List.of("akhil","reddy","Nagulapally");
        Stream<String> s=l.stream().map(a->a.toUpperCase());
        s.forEach(System.out::println);
    }
}
