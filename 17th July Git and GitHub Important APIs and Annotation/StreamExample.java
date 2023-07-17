import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Use streams to perform operations on the list
        numbers.stream()
            .filter(n -> n > 30)
            .map(n -> n * 2)
            .forEach(System.out::println);
    }
}
