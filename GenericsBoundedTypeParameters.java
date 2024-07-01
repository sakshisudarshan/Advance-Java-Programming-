package Generics;

interface base1
{
    void assign(int a, int b);
    void swaping();
    void display();
}
class swap1 implements base1 {
    private int i,j;
    @Override
    public void assign(int a,int b)
    {
        i=a;
        j=b;
    }
    @Override
    public void swaping()
    {
        int t=i;
        i=j;
        j=t;
    }
    @Override
    public void display()
    {
        System.out.println(i+" "+j);
    }
}

  class genneric <T extends base1>
  {
      T a;
     public void disp(T p)
     { a=p;
        a.assign(1, 2);
        a.display();
        a.swaping();
        a.display();
//above statements are approved because in bounded type, the type of base1 class is specific and the member //function belongs to base1, which are inherited and overridden.
        }
  }
public class GenBounded {
    public static void main (String[]args)
    {
        swap1 c=new swap1();

        genneric<swap1> b = new genneric<swap1>();
        b.disp(c);
      //  genneric <Integer> e =new genneric<Integer>();//CTE because built-in class Integer is not derived class of base1

    }
}
