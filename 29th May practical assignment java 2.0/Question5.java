public class Question5 {

    public static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 32, 54, 67, 89, 233 };
        System.out.print("Array: ");
        printArray(numbers);
    }
}
