package problems.Generics.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumericalOperation<N extends Number & Comparable> {

    List<N> numbers;

    NumericalOperation(List<N> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    public List<N> sort() {
        Collections.sort(numbers);
        return numbers;
    }

    public Number getMax() {
        return Collections.max(numbers);
    }
}
