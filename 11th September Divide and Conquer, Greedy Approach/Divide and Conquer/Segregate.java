public class Segregate {
    public static void getAllNegative(int[] arr) {
        int preIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[preIdx];
                arr[preIdx] = temp;
                preIdx++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = { 19, -20, 7, -4, -13, 11, -5, 3 };
        getAllNegative(arr);
    }

}
