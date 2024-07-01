package Generics;

import java.util.*;

public class ALWildcards {


    // Upper bound wildcard
    public static void disp(Collection<? extends Number> a) {
        Iterator x = a.iterator();
        for (; x.hasNext(); ) {
            System.out.println(x.next());
        }
    }

    // Lower bound wildcard
    public static void disp1(Collection<? super Integer> a) {
        Iterator x = a.iterator();
        for (; x.hasNext(); ) {
            System.out.println(x.next());
        }
    }

    // Unbounded wildcard
    public static void disp2(Collection<?> a) {
        Iterator x = a.iterator();
        for (; x.hasNext(); ) {
            System.out.println(x.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println("Output from upper bounded method");
        disp(a);

        System.out.println("Output from lower bounded method");
        disp1(a);

        System.out.println("Output from unbounded method");
        disp2(a);

        ArrayList<Double> b = new ArrayList<Double>();
        b.add(1.1);
        b.add(1.2);
        b.add(3.2);

        System.out.println("Output from upper bounded method");
        disp(b);

        // The following line would cause a compile-time error because b is not a subtype of Integer
        // System.out.println("Output from lower bounded method");
        // disp1(b);

        System.out.println("Output from unbounded method");
        disp2(b);

        ArrayList<Object> c = new ArrayList<Object>();
        c.add(10.2);
        c.add(1);
        c.add("sk");

        // The following line would cause a compile-time error because c is not a subtype of Number
        // System.out.println("Output from upper bounded method");
        // disp(c);

        System.out.println("Output from lower bounded method");
        disp1(c);

        System.out.println("Output from unbounded method");
        disp2(c);
    }
}


