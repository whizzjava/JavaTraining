package assignments.akhil.streams.advanced;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelStramDemo {
    public static void main(String[] args) throws Exception{
        List<Integer> l=List.of(1,2,3,4,5,6,7,8,9);
        l.parallelStream().forEach(a-> System.out.println(a+ " current thread :"+ Thread.currentThread().getName()));

        System.out.println(" after using ForkJoinPool by myself");
        System.out.println(" ");
        ForkJoinPool pool=new ForkJoinPool(5);
        pool.submit(()->l.parallelStream().forEach(a-> System.out.println(a+" current thread : "+ Thread.currentThread().getName()))).get();
    }
}
