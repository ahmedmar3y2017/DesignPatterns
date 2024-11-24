package streams.lambda;

import behaviour.iteratorPattern.code.Employee;

import java.util.function.Function;

public class Lamdas {

    public static void main(String[] args) {

        Calculator calculator = (x, y) -> x + y;

        System.out.println(calculator.calc(5, 5));
        System.out.println(calculator.calc(10, 10));

        Function<Employee, String> function = (employee) -> employee.getName() + " " + employee.getAge();

        System.out.println(function.apply(new Employee("John", "Smith", 25)));
    }
}
