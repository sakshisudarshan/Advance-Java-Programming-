enum color {
Red(10), Blue(40), Green(60);

private int ctype; // instance variable

color (int p)
{ System.out.println(p); 
ctype=p;
}
int getcolor()
{
    return ctype;
}

}
public class Main {
public static void main(String[] args) {
color c = color.Red; // calls constructor

System.out.println(color.Red);
   }
}
