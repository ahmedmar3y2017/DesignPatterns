package problems;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        // Expected Output: 0 1 1 2 3 5 8 13 21 34

    }





    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
