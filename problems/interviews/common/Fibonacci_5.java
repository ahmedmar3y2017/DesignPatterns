package problems.interviews.common;

public class Fibonacci_5 {

    public static void main(String[] args) {

        int number = 10;

        for (int i = 0; i < number - 1; i++) {

            System.out.println(fibonacci(i) + " ");

        }

    }

    public static int fibonacci(int number) {

        if (number == 0 || number == 1) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);

    }
}
