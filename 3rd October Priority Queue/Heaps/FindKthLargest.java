import java.util.*;

public class FindKthLargest {
    public static int kthLargestByMinHeap(int[] arr, int n, int k) {
        // 1. Build a minheap
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int num : arr) {
            minheap.add(num);
        }
        // 2. Delete (n-k) number of elements
        int iterations = n - k;
        while (iterations > 0) {
            minheap.remove(); // 1 2
            iterations--;
        }
        // 3. Access the root element in the minheap
        return minheap.peek();
    }

    public static void main(String args[]) {
        int[] arr1 = { 1, 2, 3, 5, 2, 6, 9 };
        int n1 = arr1.length;
        int k1 = 3;

        int[] arr2 = { 1, 7, 8, 5, 2, 6, 9 };
        int n2 = arr2.length;
        int k2 = 6;

        int res1 = kthLargestByMinHeap(arr1, n1, k1);
        int res2 = kthLargestByMinHeap(arr2, n2, k2);

        System.out.println("Output of arr1 : " + res1);
        System.out.println("Output of arr2 : " + res2);
    }
}