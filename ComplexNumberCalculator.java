package Basics;

class Complex {
    private float r, i;

    public Complex(float r, float i) {
        this.r = r;
        this.i = i;
    }

    @Override
    public String toString() {
        return r + "+i" + i;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Complex complex = (Complex) obj;
        return Float.compare(complex.r, r) == 0 &&
               Float.compare(complex.i, i) == 0;
    }
}

public class ComplexMain {
    public static void main(String[] args) {
        // Uncomment and use for testing equals method
        // Complex c1 = new Complex(1, 2);
        // Complex c2 = new Complex(1, 2);
        // if (c1.equals(c2)) {
        //     System.out.println("Objects are equal");
        // }

        System.out.println("Number of arguments: " + args.length);
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.println("Sum: " + (i + j));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide two integers.");
        }
    }
}
