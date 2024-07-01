package Generics;

import java.util.*;
public class ALBasics {
    public static void main(String[] args) {

        ArrayList<Number> a = new ArrayList<>();

        a.add(100);
        a.add(100.2);
        a.add((float)100.2);
        a.add((long)300);

        System.out.println(a);

    }
}
