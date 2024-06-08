package Basics;

public class StudentOver {
    public static void main(String[] args)
    {
        student s=new student();
        s.accept();
        s.display();
        Object obj=s;
        System.out.println(obj);
    }
}


class student{
    String name ="sakshi";
    int usn=133;
    public void accept()
    {return ;}

    public void display()
    {
        System.out.println(name+" "+usn);
    }
    @Override
    public String toString(){
        String s;
        System.out.println("in overriden function ");
        s= name +" "+usn;
        return s;

    }
}

