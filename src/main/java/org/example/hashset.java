package org.example;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("robert");
        set.add("domnic torito");
        set.add("brian");
        set.add("jhon");
        System.out.println(set);

        System.out.println("after removing one element:");
        set.remove("jhon");
        System.out.println(set);

        System.out.println("after adding one element:");
        set.add("arun");
        System.out.println(set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: " + set);

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(set.size());

        System.out.println(set.contains("Ajay"));
        System.out.println("whether the set is empty"+set.isEmpty());
        set.clear();
        System.out.println("after clearing the element in the set:");
        System.out.println("whether the set is empty "+ set.isEmpty());

    }
}