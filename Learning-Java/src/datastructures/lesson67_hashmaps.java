package datastructures;

import java.util.HashMap;

public class lesson67_hashmaps {
    public static void main(String[] args){

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        //map.remove("apple");
        //System.out.println(map.get("coconut"));
        //System.out.println(map.containsKey("pineapple"));
        //System.out.println(map.containsValue(1.00));
        //System.out.println(map.size()));

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }

    }
}
