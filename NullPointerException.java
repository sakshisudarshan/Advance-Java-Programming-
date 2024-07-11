package Collections;

import java.util.*;

public class CollectionNPE  {
    public static void main(String[] args) {
        TreeSet<Integer> i = new TreeSet<Integer>();
        Integer a = null;
        i.add(1);
       // i.add(a); // null pointer exception
        System.out.println(i);
    }
}

