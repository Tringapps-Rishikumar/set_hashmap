package org.example;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String [] args)
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("after removing one value:");
        map.remove(2,"Apple");
        System.out.println("replacing the hash value");
        map.replace(1, "Mango", "guava");
        System.out.println(map);
        System.out.println("size of the hashmap:"+map.size());
        System.out.println("wheter the set is empty:"+map.isEmpty());
        map.clear();
        System.out.println("after clearing the hashmap:"+map.isEmpty());


    }
}