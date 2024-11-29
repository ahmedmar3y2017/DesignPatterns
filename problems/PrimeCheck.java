package problems;

public class PrimeCheck {

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(15));
    }

    // time complex -> o(n)
    public static boolean isPrime(int num) {

        // <=1
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i < num/2; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }
}
