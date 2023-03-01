package org.example;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
    public static void main(String args[])
    {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("azure");
        tree.add("aws");
        tree.add("google cloud");
        tree.add("oracle");

        Iterator<String> itr=tree.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=tree.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println("Initial Set: "+tree);
        System.out.println("Reverse Set: "+tree.descendingSet());
        System.out.println("Head Set: "+tree.headSet("google cloud", true));
        System.out.println("SubSet: "+tree.subSet("azure", true, "oracle", true));
        System.out.println("TailSet: "+tree.tailSet("aws", false));
    }
}