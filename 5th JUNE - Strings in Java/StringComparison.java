public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        String str4 = "hello";

        // Using equals() method for string comparison
        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        System.out.println("Using equals() method:");
        System.out.println("str1 equals str2: " + isEqual1);  // Output: false
        System.out.println("str1 equals str3: " + isEqual2);  // Output: true

        // Using compareTo() method for string comparison
        int comparison1 = str1.compareTo(str2);
        int comparison2 = str1.compareTo(str3);
        int comparison3 = str1.compareToIgnoreCase(str4);
        System.out.println("\nUsing compareTo() method:");
        System.out.println("str1 compareTo str2: " + comparison1);  // Output: -15
        System.out.println("str1 compareTo str3: " + comparison2);  // Output: 0
        System.out.println("str1 compareToIgnoreCase str4: " + comparison3);  // Output: 32
    }
}

