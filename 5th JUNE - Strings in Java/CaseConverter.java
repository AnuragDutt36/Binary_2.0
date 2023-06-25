public class CaseConverter {
    public static String convertCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "Hello, World!";

        String convertedString = convertCase(str);

        System.out.println("Original String: " + str);
        System.out.println("Converted String: " + convertedString);
    }

}
