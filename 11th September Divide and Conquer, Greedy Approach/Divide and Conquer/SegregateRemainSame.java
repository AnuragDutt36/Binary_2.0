public class SegregateRemainSame {
    public static void getSegregateRemainSame(int[] arr, int[] newArr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        getSegregateRemainSame(arr, newArr, low, mid);
        getSegregateRemainSame(arr, newArr, (mid + 1), high);

        merge(arr, newArr, low, mid, high);
    }

    public static void merge(int[] arr, int[] newArr, int low, int mid, int high) {
        int k = low;
        for (int i = low; i <= mid; i++) {
            if (arr[i] < 0) {
                newArr[k++] = arr[i];
            }
        }

        for (int j = mid + 1; j <= high; j++) {
            if (arr[j] < 0) {
                newArr[k++] = arr[j];
            }
        }

        for (int i = low; i <= mid; i++) {
            if (arr[i] > 0) {
                newArr[k++] = arr[i];
            }
        }
        for (int j = mid + 1; j <= high; j++) {
            if (arr[j] > 0) {
                newArr[k++] = arr[j];
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = { 19, -20, 7, -4, -13, 11, -5, 3 };
        int[] newArr = new int[arr.length];
        getSegregateRemainSame(arr, newArr, 0, arr.length - 1);
        printArr(newArr);
    }
}
