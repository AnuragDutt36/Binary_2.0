public class CharacterRemover {
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != charToRemove) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        char charToRemove = 'o';

        String modifiedString = removeCharacter(str, charToRemove);

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedString);
    }

}
