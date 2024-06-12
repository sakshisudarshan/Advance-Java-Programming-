package Generics;
class swap<T> { // T is a TYPE PARAMETER
    private T i,j;
    public void assign(T a, T b) {
        i=a; j=b;
        System.out.println(i.getClass()); }
    public void swap() {
        T t=i;
        System.out.println(t.getClass());
        i=j; //Assignment or binary bits copy can be done irrespective of the type
        j=t;
    }
    public void display()
    { System.out.println(i+" "+j); }
    public T access()
    { return i; }
    public void modify(T a)
    {i=a;}
}


    public class GenMain{
        public static void main(String[] args) {
            Generics.swap<Integer> a = new Generics.swap<>(); // Integer is a TYPE ARGUMENT
            a.assign(1,2);
            a.display();
            Integer t = a.access();
            t=t+10;
            a.modify(t);
            a.display();
            a.swap();
            a.display();
        }
    }


