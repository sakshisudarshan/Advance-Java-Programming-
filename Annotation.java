package Annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

//An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
    String str();
    int val();
}
class AnnoEx {
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth()
    {}
    public static void main(String args[]) {
        AnnoEx ob = new AnnoEx();
        try {
// First, get a Class object that represents this class.
            Class c = ob.getClass();

// OR Class c = Main.class; // with no ( )
// Now, get a Method object that represents this method.
            Method m = c.getMethod("myMeth");
// Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);
// Finally, display the values.
            System.out.println(anno.str() + " " + anno.val()); }
        catch (NoSuchMethodException exc)
        { System.out.println("Method Not Found."); }
    }
}


