public class SubstringIndexFinder {
    public static int findSubstringIndex(String str, String substring) {
        int strLength = str.length();
        int subLength = substring.length();

        for (int i = 0; i <= strLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
            }
            if (j == subLength) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String substring = "World";

        int index = findSubstringIndex(str, substring);

        if (index != -1) {
            System.out.println("Substring '" + substring + "' found at index: " + index);
        } else {
            System.out.println("Substring '" + substring + "' not found in the string.");
        }
    }

}
