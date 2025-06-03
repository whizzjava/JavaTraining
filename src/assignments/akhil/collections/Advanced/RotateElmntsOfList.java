package assignments.akhil.collections.Advanced;

import java.util.ArrayList;
import java.util.List;

public class RotateElmntsOfList {
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6,7,8,9);
        ArrayList<Integer> al=new ArrayList<>(l);
        System.out.print("the original : ");
        al.forEach(System.out::println);
        int n=al.size();
        for (int i =n-1; i >0 ; i--) {
            int x=al.get(n-1);//always we should store the last element
            for (int j =n-1; j >0 ; j--) {
                al.set(j,al.get(j-1));
            }

            al.set(0,x);
            System.out.println("cycle completed");

            al.forEach(System.out::println);

        }
    }
}
