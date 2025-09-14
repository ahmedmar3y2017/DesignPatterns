package problems.said;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    static class Product {
        String category;
        String name;
        double price ;
        Product(String name, String category) {
            this.name = name;
            this.category = category;
        }
        Product(String name, String category , double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }
        public String getCategory() {
            return category;
        }

        public String toString() {
            return name;
        }

    }

    // Employee class
    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {

        Stream<String> onceModifiedStream =
                Stream.of("abcd1", "bbcd2", "cbcd3");
        // ex1 : skip first element , then substring other elements 0 -> 3
//                onceModifiedStream.skip(1).map(element -> element.substring(0, 3)).forEach(s -> System.out.println("DD : " +s));

        // ex2 : example to show pipeline & lazy
//         onceModifiedStream.filter(element -> {
//            System.out.println("filter() was called");
//            return element.contains("2");
//        }).map(element -> {
//            System.out.println(element + " map() was called");
//            return element.toUpperCase();
//        }).collect(Collectors.toSet()).forEach(element -> {
//             System.out.println(element);
//         });


        // ex3 : order of execution
//        long size = onceModifiedStream.map(element -> {
//            System.out.println("Map() was called");
//            return element.substring(0, 3);
//        }).skip(2).count();
//        // vs
//
//        System.out.println(size);
//        long size1 = onceModifiedStream.skip(2).map(element -> {
//            System.out.println("Map() was called");
//            return element.substring(0, 3);
//        }).count();
//        System.out.println(size1);


        // ex4 : paralle stream
//        List<String> names = Arrays.asList("Alice", "ABob", "Charlie", "ADavid", "Ahmed");
//        names.parallelStream()
//                .filter(name -> name.startsWith("A"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println); // Output may be unordered
//

        // ex5 : parallel streaam 2

        // Create 1 million fake employees
//        List<Employee> employees = IntStream.range(0, 1_000_000)
//                .mapToObj(i -> new Employee("Emp" + i,
//                        i % 5 == 0 ? "IT" : "HR",
//                        50_000 + (i % 10) * 1_000))
//                .collect(Collectors.toList());

        // Parallel Stream
//        long start = System.nanoTime();
//        double parallelTotalITSalary = employees.parallelStream()
//                .filter(e -> e.getDepartment().equals("IT"))
//                .mapToDouble(Employee::getSalary)
//                .sum();
//        long end = System.nanoTime();
//
//
//        System.out.println("Parallel total salary: " + parallelTotalITSalary);
//        System.out.println("Time (ms): " + (end - start) / 1_000_000);
//        // Sequential Stream
//        start = System.nanoTime();
//        double totalITSalary = employees.stream()
//                .filter(e -> e.getDepartment().equals("IT"))
//                .mapToDouble(Employee::getSalary)
//                .sum();
//        end = System.nanoTime();
//        System.out.println("Sequential total salary: " + totalITSalary);
//        System.out.println("Time (ms): " + (end - start) / 1_000_000);


        // ---------------------
        // ex6 : map vs flatmap
        /*
        *
        * 1. What is flatMap()?
1.1 Review the below structure. It consists of a 2 levels Stream or a 2d arrays.


# Stream<String[]>
# Stream<Stream<String>>
# String[][]

[
  [1, 2],
  [3, 4],
  [5, 6]
]

In Java 8, we can use the flatMap to convert the above 2 levels Stream into one Stream level or a 2d array into a 1d array.


# Stream<String>
# String[]

[1, 2, 3, 4, 5, 6]



2. Why flat a Stream?
2.1 It’s challenging to process a Stream containing more than one level,
like Stream<String[]> or Stream<List<LineItem>> or Stream<Stream<String>>.
And we flat the 2 levels Stream into one level, like Stream<String> or Stream<LineItem>,
 so that we can easily loop the Stream and process it.


2.2 Below is a 2d array, and we can use Arrays.stream or Stream.of to convert it into a Stream, and it produces a Stream of String[] or Stream<String[]>.


  String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

  // array to a stream
  Stream<String[]> stream1 = Arrays.stream(array);

  // same result
  Stream<String[]> stream2 = Stream.of(array);

or like this.


[
  [a, b],
  [c, d],
  [e, f]
]


        * */

//        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
//
//        Stream.of(array).flatMap(strings -> Arrays.stream(strings)).collect(Collectors.toSet()).forEach(System.out::println);


        // ex : group of counting
        List<Product> products = List.of(
                new Product("Laptop", "Electronics" , 50),
                new Product("TV", "Electronics" , 60),
                new Product("Banana", "Grocery" , 70),
                new Product("Apple", "Grocery" , 80)
        );

//        Map<String, Long> collectCounting  = products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
//        System.out.println(collectCounting);
//
//        // grouping and summarize
//        Map<String, Double> collect = products.stream().
//                collect(Collectors.groupingBy(Product::getCategory,
//                        Collectors.summingDouble(value -> (int) value.price)
//                ));
//        System.out.println(collect);
//


    }
}
