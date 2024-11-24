package problems;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        String expression = "{[()]}";
        System.out.println(isBalanced(expression));

    }

    public static boolean isBalanced(String input) {


        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '[' || charArray[i] == '{' || charArray[i] == '(') {
                stack.push(charArray[i]);
                continue;
            }
            if (charArray[i] == ']' || charArray[i] == '}' || charArray[i] == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (
                            (top == '(' && charArray[i] != ')') ||
                                    (top == '[' && charArray[i] != ']') ||
                                    (top == '{' && charArray[i] != '}')
                    ) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
