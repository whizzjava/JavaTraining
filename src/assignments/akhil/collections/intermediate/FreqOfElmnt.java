package assignments.akhil.collections.intermediate;


import java.util.List;
import java.util.TreeSet;

public class FreqOfElmnt {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,74,5,3,6,2,3,1);
        TreeSet<Integer> ts=new TreeSet<>(l);
//        for (int i = 0; i <ts.size() ; i++) {
//            int count=0;
//            for (int j = 0; j <l.size() ; j++) {
//                if(ts.toArray()[i]==l.get(j)){
//                    count++;
//                }
//            }
//            System.out.println("the frequency of "+ts.toArray()[i]+" is "+count);
//
//        }//approach one-- worked as expected, but can be improved

        for (Integer unq:ts
             ) {

        }


    }
}
