package problems.functionalProgramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class Composition {

    public static void main(String[] args) {

        // and then
        // trim + capitalize first letter + add . dot at the end of text
        // using function chainig -> composition
        Function<String, String> trim = String::trim;
        Function<String, String> capitalize = s -> s.substring(0, 1).toUpperCase() + s.substring(1);
        Function<String, String> addDot = s -> s + " .";
        Function<String, String> addPrefix = s -> "MR : " + s;

        Function<String, String> compineAll = trim.andThen(capitalize).andThen(addDot);

        System.out.println(compineAll.apply("ahmed"));

        // compose
        Function<String, String> compose = compineAll.compose(addPrefix);
        System.out.println(compose.apply("ahmed"));


        // other example
        Function<String, String> trimS = String::trim;
        Function<String, String> lowerCase = String::toLowerCase;
        Function<String, Boolean> isEmail = s -> s.contains("@");

        Function<String, Boolean> stringBooleanFunction = trimS
                .andThen(lowerCase)
                .andThen(isEmail);

        System.out.println(stringBooleanFunction.apply("   Test@Example.com  ")); // → true

        // full example validator
        /*
        *
        * Trim whitespace
          Convert input to lowercase
          Validate it's not empty
          Validate it contains @
        * */

        Function<String , String> strToLowerCase = s -> s.toLowerCase();
        Function<String , String> strTrim = s -> s.trim();

        Predicate<String> strNotEmpty = s -> !s.isEmpty();
        Predicate<String> strIsEmail = s -> s.contains("@");

        // one compiine -> input clean
        Function<String , String> strClean = strTrim.andThen(strToLowerCase);

        // 2 compine check email
        Function<String, Boolean> stringBooleanFunction1 = strClean.andThen(str -> strNotEmpty.test(str) && strIsEmail.test(str));

        System.out.println(stringBooleanFunction1.apply("Test@Example.com"));


    }
}
