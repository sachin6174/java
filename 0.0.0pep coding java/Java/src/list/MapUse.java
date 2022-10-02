package list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(7,3);
        map.put(1,9);
        
        for(int x : map.keySet()){
            System.out.println(x + " " + map.get(x));
        }

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove(1));
//        map.clear();
        System.out.println(map);
        System.out.println(map.containsKey(7));
        Set<Map.Entry<Integer,Integer>> set= map.entrySet();
        System.out.println(set);
    }

}
