
public class ExceptTwoSwapped {
    public static void getSortedArray(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int x = -1;
        int y = -1;
        int prev = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (prev > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                } else {
                    y = i;
                }
            }
            prev = arr[i];
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = { 3, 8, 6, 7, 5, 9, 10 };
        System.out.print("Before Sorting, Array be like this : ");
        printArr(arr);

        System.out.print("After Sorting, Array be like this: ");
        getSortedArray(arr);
        printArr(arr);
    }
}
