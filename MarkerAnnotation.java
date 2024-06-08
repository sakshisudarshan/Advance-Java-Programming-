import java.lang.annotation.*;
import java.lang.reflect.*;
// A marker annotation.
@Retention(RetentionPolicy.RUNTIME) 
@interface MyMarker { }

class Main {
// Annotate a method using a marker. 
// Notice that no ( ) is needed.
@MyMarker
public static void myMeth()
{}
public static void main(String args[])
{ Main ob = new Main(); 
try 
  {
Method m = ob.getClass().getMethod("myMeth");
// Determine if the annotation is present.
if(m.isAnnotationPresent(MyMarker.class))
System.out.println("MyMarker is present.");
  }
catch (NoSuchMethodException exc)
{ System.out.println("Method Not Found."); }
 }
}
