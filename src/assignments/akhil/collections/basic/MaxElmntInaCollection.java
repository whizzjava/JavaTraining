package assignments.akhil.collections.basic;

import java.util.*;

public class MaxElmntInaCollection {

    public static void main(String[] args) {
         List<Integer> l=new ArrayList<>();
        l.add(22);
        l.add(34);
        l.add(21);
        l.add(31);
        l.add(20);
        l.add(30);
        l.add(12);
        l.add(13);
        Collections.sort(l);
        Collections.reverse(l);
        System.out.println(l.get(0));

    }
}
