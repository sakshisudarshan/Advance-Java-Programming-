package Generics;

class dispp<T> {
    public void disp1(T a) {
        System.out.println(a);
    }
}

public class GenInstance {
    public static void main(String[] args) {
        dispp<Object> r = new dispp<Object>();
        Integer a = 10;
        r.disp1(a);
        String p = "aaa";
        r.disp1(p);
    }
}

