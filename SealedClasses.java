sealed class A extends Thread implements Cloneable permits B,C{}

final class B extends A {}

sealed class C extends A permits D {}

non-sealed class D extends C {}

class E extends D{}

class F extends D{}

// interfaces -> sealed (or) non-sealed
// classes -> sealed (or) non-sealed (or) final
sealed interface X permits Y {}

sealed interface Y extends X {}

final class Z implements Y{}
public class Main{
    public static void main (String [] args){

    }
}
