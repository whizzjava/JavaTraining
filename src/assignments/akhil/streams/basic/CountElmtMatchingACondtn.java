package assignments.akhil.streams.basic;

import java.util.List;

public class CountElmtMatchingACondtn {

    public static void main(String[] args) {
        List<Integer> l= List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(l.stream().filter(a->a%2==0).count());


    }
}
