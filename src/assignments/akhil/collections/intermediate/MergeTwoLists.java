package assignments.akhil.collections.intermediate;

import java.util.*;

public class MergeTwoLists {
    public static void main(String[] args) {
//        List<Integer> l=List.of(3,4,5,1,2,8,9,12,13);
//        List<Integer> l2=List.of(10,11,14,6,7);
//        l.sort(Integer::compareTo);
//        l2.sort(Comparator.naturalOrder());
//        for (int i:l2
//             ) {
//            l.add(i);
//        }
////        SortedSet<Integer> s= l;
//        l.forEach(System.out::println);
        // approach no1--- did not work as expected
        //**************
//        List<Integer> l=List.of(3,4,5,1,2,8,9,12,13);
//
//      SortedSet<Integer> ss=new TreeSet<>(l);
//      List<Integer> l2=List.of(10,11,14,6,7);
//      SortedSet<Integer> ss2=new TreeSet<>(l2);
//        for (int i:ss2
//
//             ) {
//            ss.add(i);
//        }
//        ss.forEach(System.out::println);
        //approcah no 2--- worked as expected
        //********************

        List<Integer> l=List.of(3,4,5,1,2,8,9,12,13);

        List<Integer> l2=List.of(10,11,14,6,7);

        SortedSet<Integer> ss=new TreeSet<>(l);
        ss.addAll(l2);
        ss.forEach(System.out::println);//the best case


    }
}
