package problems.interviews.common;

public class Palindrome_3 {
    public static void main(String[] args) {

        String str = "radar"; // Example string
        boolean isPalindrome = isPalindrome(str);

        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String string) {

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) != string.charAt(string.length() - 1 - i))
                return false;
        }

        return true;

    }
}
