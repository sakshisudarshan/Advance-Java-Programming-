import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 4, 6, 7, 3);
        
        int result = nums.stream()
                         .filter(n -> n % 2 == 0)
                         .map(n -> n * 2)
                         .reduce(0, (c, e) -> c + e);
        
        System.out.println(result);
    }
}
