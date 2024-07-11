package Collections;

import java.util.*;

class student {
    private String name, usn;

    public student(String n, String u) {
        name = n;
        usn = u;
    }

    @Override
    public String toString() {
        System.out.println("toString called");
        return name + " " + usn;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals method called");
        student b = (student) obj;
        if (name.equals(b.name) && usn.equals(b.usn))
            return true;
        return false;
    }
}

class CollectionInterface {
    public static void main(String[] args) {
        ArrayList<student> a = new ArrayList<student>();
        ArrayList<student> b = new ArrayList<student>();

        a.add(new student("1", "1"));
        a.add(new student("2", "2"));
        b.add(new student("3", "3"));
        b.add(new student("4", "4"));

        a.addAll(b);

        System.out.println(a.contains(new student("4", "4")));
        System.out.println(a);

        a.add(new student("1", "1"));
        a.add(new student("2", "2"));
        b.add(new student("2", "2"));
        b.add(new student("1", "1"));

        // if order of info is maintained in b (i.e 1 after 2) a.equals returns true
        System.out.println(a.equals(b));
    }
}

