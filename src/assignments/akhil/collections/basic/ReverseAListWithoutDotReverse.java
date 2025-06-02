package assignments.akhil.collections.basic;

import java.util.ArrayList;
import java.util.List;

public class ReverseAListWithoutDotReverse {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
//        System.out.println(l);
//        System.out.println(l.size());
        int n=l.size();
//        System.out.println((n-1)/2);
        int addn=0;
        if(n%2==0){
            addn=1;
        }

        for(int i=0;i<(((n-1)/2)+addn);i++)
        {
            int j=l.get(n-1-i);
            int f=l.get(i);
//            System.out.println(l);
            l.set(i,j);
//            System.out.println(l);
            l.set(n-1-i,f);
            System.out.println(l);
        }



    }
}
