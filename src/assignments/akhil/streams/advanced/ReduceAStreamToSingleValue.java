package assignments.akhil.streams.advanced;

import java.util.List;

public class ReduceAStreamToSingleValue {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6);
        System.out.println(l.stream().reduce(0,(a,b)->a+b));
    }
}
