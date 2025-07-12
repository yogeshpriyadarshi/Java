
import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        // HashSet

        HashSet<Integer> set = new HashSet<>();

        // insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(7);

        // search
        if(set.contains(1)){
            System.out.println("Yes!!! It is available");
        }

        // delete
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("not avaiable");
        }

        System.out.println(set.size());

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        // HashMap

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Apple",120);
        map.put("Orange",150);
        map.put("Kivi",140);

        if(map.containsKey("Apple")){
            System.out.println("Keys are available!");
        }
        int value = map.get("Orange");
        System.out.println(value);

        // Iterator
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
        }

    }
    
}
