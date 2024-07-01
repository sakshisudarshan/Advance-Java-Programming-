package Generics;

interface add_interface {
    public void add(Object q);
}

class add_int implements add_interface {
    Integer a;

    public add_int(int r) {
        a = r;
    }

    @Override
    public void add(Object q) {
        add_int b = (add_int) q;
        System.out.println("int " + (a + b.a));
    }
}

class add_string implements add_interface {
    String a;

    public add_string(String s) {
        a = s;
    }

    @Override
    public void add(Object q) {
        add_string b = (add_string) q;
        System.out.println("String " + (a + b.a));
    }
}

class adding1<T extends add_interface> {
    public void add(T p, T q, String s) {
        System.out.println(s);
        p.add(q);
    }
}

public class GenTest {
    public static <T extends add_interface> void add(T p, T q, String s) {
        System.out.println(s);
        p.add(q);
    }

    public static void main(String[] args) {
        add_int a = new add_int(1);
        add_int b = new add_int(1);
        GenTest.add(a, b, "Calling Static function (for int add)");

        adding1<add_int> c = new adding1<>();
        c.add(a, b, "Calling Member function (for int add)");

        add_string p = new add_string("rnsit");
        add_string q = new add_string("jssate");
        GenTest.add(p, q, "Calling Static function (for string add)");

        adding1<add_string> d = new adding1<>();
        d.add(p, q, "Calling Member function (for string add)");
    }
}
