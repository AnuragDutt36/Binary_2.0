public class RemoveConsonants {
    public static String removeConsonants(String sentence) {
        // Define a string with all consonants
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        // Remove all consonants from the sentence
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (consonants.indexOf(c) == -1) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence = "Hello, have a good day";
        String result = removeConsonants(sentence);
        System.out.println("Result: " + result);
    }

}
