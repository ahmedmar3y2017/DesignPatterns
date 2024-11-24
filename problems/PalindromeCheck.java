package problems;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "radar"; // Example string
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        String str1 = "raddar"; // Example string
        boolean isPalindrome1 = checkPalindrome(str1);
        if (isPalindrome1) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }

    public static boolean checkPalindrome(String str) {

        int left = 0, right = str.length() - 1;
        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
