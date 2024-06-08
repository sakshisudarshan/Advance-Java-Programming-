enum color {
Red(10), Blue(40), Green;

private int ctype; // instance variable

color (int p)
{ 
    System.out.println("Param C"); 
    ctype=p; 
    
}
color() 
{
    System.out.println("Zero PC");
}

int getcolor()
{ return ctype; }

}
public class Main {
public static void main(String[] args) {
color c=color.Red;
System.out.println(c.getcolor());
c=color.Blue; System.out.println(c.getcolor());
c=color.Green; System.out.println(c.getcolor());
   }
}
