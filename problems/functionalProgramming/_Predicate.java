package problems.functionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        Predicate<String> isValidPhoneNumber = (phoneNumber) -> phoneNumber.matches("\\d{10}");
        System.out.println("isValidPhoneNumber : " + isValidPhoneNumber.test("0987654321"));
        Predicate<String> extraValidPhoneNumber = (phoneNumber) -> phoneNumber.contains("3");
        System.out.println("extraValidPhoneNumber : " + extraValidPhoneNumber.test("0103"));

        boolean test = isValidPhoneNumber.and(extraValidPhoneNumber).test("0987654321");
        System.out.println("test : " + test);

        BiPredicate<String , String > stringBiPredicate = (s, s2) -> s.matches(s2);
        System.out.println("stringBiPredicate : " + stringBiPredicate.test("s1" , "s1"));
    }
}
