import java.util.Scanner;
import java.util.Stack;

public class DailyTemperature {
    public static void getDays(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] newArr = new int[temp.length];
        for (int i = temp.length - 1; i >= 0; i--) {
            while (!stack.empty() && temp[stack.peek()] <= temp[i]) {
                stack.pop();
            }

            if (!stack.empty()) {
                newArr[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        System.out.println("Output");
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        getDays(arr);

    }
}
