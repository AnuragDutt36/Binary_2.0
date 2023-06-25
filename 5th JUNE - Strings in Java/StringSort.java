import java.util.Arrays;

public class StringSort {
    public static String sortStringAlphabetically(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String inputString = "OpenAI";
        String sortedString = sortStringAlphabetically(inputString);
        System.out.println(sortedString);
    }
}
