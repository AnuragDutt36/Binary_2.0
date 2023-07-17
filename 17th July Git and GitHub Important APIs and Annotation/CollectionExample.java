import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the collection
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Access and modify elements in the collection
        int firstNumber = numbers.get(0);
        numbers.set(2, 40);

        // Iterate over the collection using a for-each loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
