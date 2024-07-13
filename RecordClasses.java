record Student(int usn,String name){
    public Student {
        if (usn == 0) {
            throw new IllegalArgumentException("usn cannot be zero");
        }
    }
}
public class Main{
    public static void main (String [] args){

      //  Student s= new Student(0,"sk"); //this line gives IllegalArgumentException
        Student s1=new Student(1,"bubu");
        Student s2= new Student(2,"kuku");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.name());
        System.out.println(s2.name());

    }
}
