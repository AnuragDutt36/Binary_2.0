import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop(); // Invalidate the previous score
            } else if (op.equals("D")) {
                int prevScore = stack.peek();
                stack.push(prevScore * 2); // Record a new score that is double of the previous
            } else if (op.equals("+")) {
                int lastScore = stack.pop();
                int secondLastScore = stack.peek();
                stack.push(lastScore);
                stack.push(lastScore + secondLastScore); // Record a new score that is sum of last two scores
            } else {
                stack.push(Integer.parseInt(op)); // Record a new score of x
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        BaseballGame solution = new BaseballGame();

        String[] ops1 = { "5", "2", "C", "D", "+" };
        System.out.println(solution.calPoints(ops1)); // Output: 30

        String[] ops2 = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        System.out.println(solution.calPoints(ops2)); // Output: 27

        String[] ops3 = { "1", "C" };
        System.out.println(solution.calPoints(ops3)); // Output: 0
    }
}
