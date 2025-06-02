package assignments.akhil.streams.basic;

import java.util.Comparator;
import java.util.List;

public class MaxAndMinInList {

    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,4,7,8,9,5);
        int mx = l.stream().max(Integer::compareTo).get();
//      int mn = l.stream().min((a,b)->a.compareTo(b)).get();
        int mn = l.stream().min(Comparator.naturalOrder()).get();
        System.out.println("minimum : "+mn);
        System.out.println("minimum : "+mx);

    }
}
