package Basics;
class Person {
    private String name , aadharNumber;
    private static int cnt;

    public Person() {
        System.out.println("Person : In ZPC"); //zero parameterized constructor
        cnt++;
    }

    public Person(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        cnt++; //intention of incrementing cnt value is to count the instances of type person
    }

    public Person(String name) {
        this(name,null); // invokes or calls 2 parameterized constructor
    }

    @Override
    public String toString()
    {
        String t=super.toString();
        t=name+ " " +aadharNumber;
        System.out.println("number of objects created" + cnt);
        return t;
    }

}

class Student extends Person {
    private float marks;
    public Student(){
        super();
        System.out.println("Student: ZPC");
    }

    public Student(String name, String aadharNumber, float marks) {
        super(name, aadharNumber);
        this.marks = marks;
    }

    public Student(String name) {
        this(name,null,0);
    }

    @Override
    public String toString() {
        System.out.println("Student: To string");
        String t;
        t=super.toString();
        t=t+ " "+marks;
        return t;
    }
}
public class PersonEx {
    public static void main(String[]args){


        Student s=new Student("ab");
        System.out.println(s);
        System.out.println(s.getClass());
        Person p=new Person("abab","100");
        System.out.println(p);
        System.out.println(p.getClass());
    }
}
