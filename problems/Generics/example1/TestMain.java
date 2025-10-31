package problems.Generics.example1;

import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        NumericalOperation<Integer> integerNumericalOperation = new NumericalOperation<Integer>(List.of(8,6,9,8,7,4));

        System.out.println(integerNumericalOperation.numbers);
        System.out.println(integerNumericalOperation.getMax());
        System.out.println(integerNumericalOperation.sort());

    }
}
