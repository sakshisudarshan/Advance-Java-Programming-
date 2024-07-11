package Collections;

class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class CollectionCCE {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // myAnimal is a reference to a Dog object
       // Cat myCat = (Cat) myAnimal; // This will throw ClassCastException as
        System.out.println(myAnimal.getClass());

    }
}
