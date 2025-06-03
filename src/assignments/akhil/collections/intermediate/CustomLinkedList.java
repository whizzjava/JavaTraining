package assignments.akhil.collections.intermediate;

import java.util.LinkedList;
import java.util.List;

public class CustomLinkedList {

    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7);
        LinkedList<Integer> ll=new LinkedList<>(l);
                ll.forEach(System.out::println);
                ll.add(2,10);
                ll.remove(7);
        System.out.println("after some basic operations of linked list");
                        ll.forEach(System.out::println);
    }
}
