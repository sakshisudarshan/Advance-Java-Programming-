package Generics;
public class GenMeth {

        public static <T> void disp(T a)
        { 
            System.out.println(a);
        }
        public static void main(String[] args)
        {
            Integer a = 10;
            disp(a);
            String p="aaa";
            disp(p);
        }
}
