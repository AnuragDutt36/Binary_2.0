public class CheckLetter {
    public static void main(String[] args) {
        String word = "Umbrella";
        boolean isPresent = false;

        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("The letter 'e' is present in the word.");
        } else {
            System.out.println("The letter 'e' is not present in the word.");
        }
    }
}

