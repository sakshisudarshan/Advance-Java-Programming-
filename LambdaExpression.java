interface A{
   public void show(int i);
}

public class Main {
    public static void main(String[] args){
      
         A obj = (i) ->  System.out.println("in show " +i);
         obj.show(5);
    }
}
