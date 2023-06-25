public class SentenceReversal {
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseString(word);
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String inputSentence = "Think Twice";
        String reversedSentence = reverseSentence(inputSentence);
        System.out.println(reversedSentence);
    }
}
