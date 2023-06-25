public class PalindromeChecker {
    
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            // Compare characters at left and right indices
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters don't match, not a palindrome
            }
            
            // Move the indices towards the center
            left++;
            right--;
        }
        
        return true; // All characters match, it's a palindrome
    }
    public static void main(String[] args) {
        String str = "racecar"; // The string to check for palindrome
        
        boolean isPalindrome = checkPalindrome(str);
        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
