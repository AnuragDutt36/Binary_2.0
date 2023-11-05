package Stacks;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        
        StringBuilder currentString = new StringBuilder();
        int currentCount = 0;
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentCount = currentCount * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currentCount);
                resultStack.push(currentString.toString());
                currentCount = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(ch);
            }
        }
        
        return currentString.toString();
    }

    public static void main(String[] args) {
        DecodeString solution = new DecodeString();
        
        String s1 = "3[a]2[bc]";
        System.out.println(solution.decodeString(s1)); // Output: "aaabcbc"
        
        String s2 = "3[a2[c]]";
        System.out.println(solution.decodeString(s2)); // Output: "accaccacc"
        
        String s3 = "2[abc]3[cd]ef";
        System.out.println(solution.decodeString(s3)); // Output: "abcabccdcdcdef"
    }
}
