package problems.interviews.common;

public class PrimeNumber_6 {
    public static void main(String[] args) {

        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
        System.out.println(isPrime(15));
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number / 2; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
