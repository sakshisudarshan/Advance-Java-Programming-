package Generics;

class disp<G> {
    private G data;
    public disp( G data)
    {   this.data=data;
        System.out.println(data.getClass());
    }
  public void show(){
      System.out.println("data" +data);
  }
}
public class GenBasic {
    public static void main(String[] args) {
        disp<Integer> r = new disp<Integer>(20);
        r.show();

    }
}
