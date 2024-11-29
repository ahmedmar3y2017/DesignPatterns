package problems.interviews.common;

public class ReverseString_1 {

    public static void main(String[] args) {

        System.out.println(reverseString("ahmed mohamed"));

    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < input.length() / 2; i++) {

            char temp = charArray[i];
            charArray[i] = charArray[input.length() - 1 - i];
            charArray[input.length() - 1 - i] = temp;
        }

        return new String(charArray);


    }
}

