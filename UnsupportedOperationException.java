package Collections;

import java.util.Arrays;
import java.util.List;
public class CollectionUOE {
    public static void main(String[] args){
        Integer a[] = { 1, 2 };
        List<Integer> I = Arrays.asList(a);
        System.out.println(I);
        //I.add(3); // generates java.lang.UnsupportedOperationException
        System.out.println(I.getClass());
    }
}
