package assignments.akhil.collections.Advanced;

import java.util.ArrayList;
import java.util.List;

public class SubListExtraction {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,8,9);
        ArrayList<Integer> al=new ArrayList<>(l);
        List<Integer> sublist=al.subList(4,7);
        System.out.println("given array list");
        al.forEach(a-> System.out.print(a+" "));
        System.out.println("");
        System.out.println("extracted sublist");
        sublist.forEach(b-> System.out.print(b+" "));
    }
}
