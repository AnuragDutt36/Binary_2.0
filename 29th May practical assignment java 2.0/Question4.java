public class Question4 {

    public static int findElementIndex(int array[], int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 10, 20, 30, 40, 50 };
        int target = 40;

        int index = findElementIndex(numbers, target);

        if (index != -1) {
            System.out.println("Index of " + target + " is " + index);
        } else {
            System.out.println(target + " not found in the array");
        }

    }
}
