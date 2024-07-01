package Generics;

import java.util.List;

public class GenWildcard {

    // Bounded type parameter method
    public static <T extends Number> void printSumBounded(List<T> list) {
        double sum = 0.0;
        for (T element : list) {
            sum += element.doubleValue(); // Accessing doubleValue() method of Number
        }
        System.out.println("Sum (bounded): " + sum);
    }

    // Wildcard method
    public static void printSumWildcard(List<? extends Number> list) {
        double sum = 0.0;
        for (Number element : list) {
            sum += element.doubleValue(); // Accessing doubleValue() method of Number
        }
        System.out.println("Sum (wildcard): " + sum);
    }

    public static void main(String[] args) {
        // Bounded type parameter method
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        printSumBounded(integerList); // Output: Sum (bounded): 15.0

        // Wildcard method
        List<Double> doubleList = List.of(1.5, 2.5, 3.5, 4.5, 5.5);
        printSumWildcard(doubleList); // Output: Sum (wildcard): 17.5
    }
}



