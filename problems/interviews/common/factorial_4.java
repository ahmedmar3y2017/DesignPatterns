package problems.interviews.common;

public class factorial_4 {

    public static void main(String[] args) {

        System.out.println(factorial(4));

    }

    public static int factorial(int n) {

        return n == 1 ? 1 : n * factorial(n - 1);
    }
}
