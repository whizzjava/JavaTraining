package assignments.akhil.collections.intermediate;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
class LRUCache<K,V> extends LinkedHashMap<K, V>
{
    private  final int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
public class LRUCacheUsingLinkedHashMap {

    public static void main(String[] args) {
//        Map<Integer,String> l=Map.of(1,"Akhil",2,"Reddy",3,"Nagulapally");
        LRUCache<Integer,String > lruCache=new LRUCache<>(3);
        lruCache.put(1,"Akhil");
        lruCache.put(2,"reddy");
        lruCache.put(3,"Nagulapally");
        System.out.println("before accessing key 1 and 3"+ lruCache);
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(1));
        lruCache.put(4,"Reddy");
        System.out.println("after accessing key 1 and 3"+ lruCache);
//        @Override
//        public void removeEldestEntry(){
//
//        }



    }
}
