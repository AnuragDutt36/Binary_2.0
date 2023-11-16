import java.util.*;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] a) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : a) {
            // Handle collisions
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() >= 0) {
                int top = stack.pop();
                if (Math.abs(top) == Math.abs(asteroid)) {
                    // Both asteroids will be destroyed
                    asteroid = 0;
                    break;
                } else if (Math.abs(top) > Math.abs(asteroid)) {
                    // The current asteroid will be destroyed
                    stack.push(top);
                    asteroid = 0;
                    break;
                }
            }

            // If the current asteroid survived the collisions, push it to the stack
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        // Convert the stack to an array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        int[] result = asteroidCollision(asteroids);

        // Print the result
        System.out.print("Ouput: ");
        for (int value : result) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}