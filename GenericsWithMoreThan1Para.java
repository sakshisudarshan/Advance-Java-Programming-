package Generics;

import java.util.*;
class generic<u, v>
{   u a;
    v b;
    public void assign(u p, v q)
    {
        a=p;
        b=q;
    }
    public void display()
    {
        System.out.println(a+ " "+b);
    }
}
public class Gen2Types {
    public static void main(String[] args) {
        generic<Integer, Float> a = new generic<Integer, Float>();
        a.assign(1, (float) 1.2);
        a.display();
        generic<String, Integer> b = new generic<String, Integer>();
        b.assign("sakshi", 10);
        b.display();

    }
}
