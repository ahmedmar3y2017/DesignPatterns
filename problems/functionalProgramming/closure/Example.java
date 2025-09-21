package problems.functionalProgramming.closure;

import java.util.*;
import java.util.function.Function;

import static java.util.Map.entry;

public class Example {
    public static void main(String[] args) {

        // we have 3 categories of basic salaries
        // a : 1000 , b : 2000 , c : 3000
        HashMap<String, Double> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("a", 1000.0);
        objectObjectHashMap.put("b", 2000.0);
        objectObjectHashMap.put("c", 3000.0);

        // in impretive way we will create function that take 2 params {basic salary , bonus}
        System.out.println(calculateTotalSalary(1000.0).apply(50.0));
        System.out.println(calculateTotalSalary(1000.0).apply(50.0));
        System.out.println(calculateTotalSalary(2000.0).apply(50.0));
        System.out.println(calculateTotalSalary(3000.0).apply(50.0));

        List<Map.Entry<String, Function<Double, Double>>> list = objectObjectHashMap.entrySet().stream().map(objectObjectEntry -> {

            return entry(objectObjectEntry.getKey(), calculateTotalSalary(objectObjectEntry.getValue()));
        }).toList();

        System.out.println("------------- Other way --------------- ");
        System.out.println(list.get(0).getValue().apply(50.0));
        System.out.println(list.get(0).getValue().apply(50.0));
        System.out.println(list.stream().filter(stringFunctionEntry -> stringFunctionEntry.getKey().equals("b")).findFirst().get().getValue().apply(50.0));
        System.out.println(list.stream().filter(stringFunctionEntry -> stringFunctionEntry.getKey().equals("c")).findFirst().get().getValue().apply(50.0));

    }

    // reduce number of parameters
    public static Function<Double, Double> calculateTotalSalary(Double basicSalary) {
        // common state for each basic salary group
        double addedSalary = .2 * basicSalary;
        // function impure depends on other parameters outside scope
        return (bonus) -> basicSalary + addedSalary + bonus;
    }

}
