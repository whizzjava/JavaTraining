package assignments.akhil.collections.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ArrayToCollection {
    public static void main(String[] args) {
        int[] a=new int[5];

        List<Integer> l=new ArrayList<>();
        for (int x:a
             ) {
            l.add(x);

        }
        System.out.println(l);

    }
}
