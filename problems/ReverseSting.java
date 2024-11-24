package problems;

public class ReverseSting {

    public static void main(String[] args) {

        System.out.println(reverseSting("ahmed marey"));
    }

    public static String reverseSting(String input) {

        char[] chars = input.toCharArray();

        for (int i = 0; i < input.length() / 2; i++) {

            char temp = chars[i];
            chars[i] = chars[input.length() - i - 1];
            chars[input.length() - i - 1] = temp;

        }


        return new String(chars);
    }
}
