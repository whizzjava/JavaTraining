package assignments.akhil.collections.Advanced;

import java.util.ArrayList;
import java.util.List;

public class PartitionIntoOddAndEvenLists {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,8,9);
        ArrayList<Integer> al=new ArrayList<>(l);
        ArrayList<Integer> evenlist=new ArrayList<>();
        ArrayList<Integer> oddlist=new ArrayList<>();

        Object[] a=al.toArray();
        for (Object x:a
             ) {
            if(x instanceof Integer)
            {
                int i=(Integer)x;
                if(i%2==0)
                {
                    evenlist.add(i);
                }
                else
                {
                    oddlist.add(i);
                }
            }
        }
        System.out.println("even list");
        evenlist.forEach(System.out::println);
        System.out.println("odd list");
        oddlist.forEach(System.out::println);
    }
}
