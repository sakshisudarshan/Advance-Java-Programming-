package Enumerations;

enum color
{ RED, GREEN, BLUE,BLACK};

public class Enumer {
    public static void main(String[]args)
    {
        color c;
        c = color.RED;
       System.out.println(c);
        color d;
        d=color.BLUE;
        //only equality operator can be used
      if(c!=d)
        {
           System.out.println(c!=d);
        }
        //enumeration value can be used to control a switch statement
        switch(c)
        {
            case RED: System.out.println("R selected");
                        break;
            case GREEN: System.out.println("G selected");
                        break;
            case BLUE: System.out.println("B selected");
                        break;
        }
        System.out.println(color.valueOf("BLACK"));

        color e[] = color.values();

        for (color i : e) // for-each loop
        { System.out.println(i);}


    }


}
