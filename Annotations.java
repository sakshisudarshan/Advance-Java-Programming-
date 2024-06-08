// Show all annotations for a class and a method. import java.lang.annotation.*;
import java.lang.reflect.*; 
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
String str(); int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What
{ String description(); }
@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)
class Main {
@What(description = "An annotation test method") 
@MyAnno(str = "Testing", val = 100)
  
public static void myMeth()
{}
public static void main(String args[]) {

Main ob = new Main();
try {
Annotation []annos = ob.getClass().getAnnotations(); 
System.out.println("All annotations for class Main:"); 
for(Annotation a : annos)
System.out.println(a);
System.out.println();
System.out.println("All annotations for myMeth:");
Method m = ob.getClass( ).getMethod("myMeth"); 
annos = m.getAnnotations();
for(Annotation a : annos)
System.out.println(a);
}
catch (NoSuchMethodException exc) 
{
  System.out.println("Method Not Found.");
} 
}
}
