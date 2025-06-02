package assignments.akhil.collections.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Akhil");
        hm.put(2,"Pavan");
        hm.put(3,"rohith");
        Set<Map.Entry<Integer,String>> s=hm.entrySet();
        Iterator<Map.Entry<Integer,String>> i=s.iterator();
        while (i.hasNext())
        {
            Map.Entry<Integer,String> me=i.next();
            int x=me.getKey();
            String y=me.getValue();
            System.out.println(x+"\t"+y);
        }
    }
}
