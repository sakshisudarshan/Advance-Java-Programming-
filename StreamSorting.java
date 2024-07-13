import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 4, 6, 7, 10, 3, 12, 18);
        
        Stream<Integer> sortedValues = nums.stream()
                                           .filter(n -> n % 2 == 0)
                                           .sorted();
        
        sortedValues.forEach(n -> System.out.println(n));
    }
}
