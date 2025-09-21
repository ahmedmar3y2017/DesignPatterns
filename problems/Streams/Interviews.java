package problems.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Interviews {

    public static void main(String[] args) {
        // 1 - find the word that have the highest length
//        String str = "ahmed mohamed yousefsss aly maraey";
//        Arrays.stream(str.split(" "))
//                .max(Comparator.comparing(String::length))
//                .ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));

        // 2 - remove duplicated from string and return with the same order
//        String str= "afghdbadgh";
//        Arrays.asList(str.split(""))
//                .stream()
//                .distinct()
//                .forEach(System.out::print);
//        System.out.println();
//        str.chars().distinct().mapToObj(operand -> (char)operand)
//                .forEach(System.out::print);
        // 3 - find the word that have the second highest length
//        String str = "ahmed mohamedd yousefdsss aly maraey";
//        Arrays.stream(str.split(" "))
//                .sorted(Comparator.comparing(String::length , Comparator.reverseOrder())) // reverse to get desc
//                .skip(1).findFirst()
//                .ifPresent(System.out::println);

        // 4 - find the second highest length
//        String str = "ahmed ohamedd yousefdsss aly maraey";
//        Arrays.stream(str.split(" "))
//                .map(String::length)
//                .sorted(Comparator.comparing(Integer::intValue , Comparator.reverseOrder()))
//                .skip(1)
//                .findFirst()
//                .ifPresent(System.out::println);

        // 5 - Given a sentence, find the occurrence of each word
//        String str = "ahmed ahmed ohamedd Yousefdsss yousefdsss yousefdsss aly maraey";
//        Arrays.stream(str.toLowerCase().split(" "))
//                .collect(Collectors.groupingBy(s -> s , Collectors.counting()))
//                .forEach((s, aLong) -> System.out.println(s + " -> " + aLong));

        // 6 - Given a sentence, find the words with a specified number of vowels
//        String str = "ahmed ahmed ohamedd Yousefdsss yousefdsss yousefdsss alay maraey";
//        Arrays.stream(str.split(" "))
//                .filter(str1 -> wordCoun(str1) == 2 )
//                .forEach(str1 -> System.out.println(str1));

        // 7 - Divide given integer list into lists of even and odd numbers
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(integer -> integer % 2 == 0, Collectors.toList()))
//                .entrySet().stream().map(booleanListEntry -> booleanListEntry.getValue())
//                .forEach(System.out::print);

        // 8 - Given a word, find the occurrence of each character
//        String str = "ahmed ahmed ohamedd Yousefdsss yousefdsss yousefdsss aly maraey";
//        Arrays.stream(str.trim().replaceAll(" " , "").toLowerCase().split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .forEach((s, aLong) -> System.out.println(s + " " + aLong));

        //  9 - Arrange the numbers in Descending/Ascending Order
//        int[] arr = {5, 20, 6, 2, 8, 99, 10};
//        // 1
//        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        Collections.sort( collect , Collections.reverseOrder());
//        System.out.println(collect);
//
//        // 2
//        Arrays.stream(arr).mapToObj(value -> value).sorted(Collections.reverseOrder())
//                .forEach(System.out::print);

        // 10 - Given an array, find the sum of unique elements
//        int[] arr = {5, 20, 20, 8, 8, 10};
//        int sum = Arrays.stream(arr).distinct().sum();
//        System.out.println("Sum : " + sum);

        // 11 - Given a string, find the first non-repeated character
        // 1 when indexof = lasttindexof -> the same occured
//        String str = "hello";
//        Arrays.stream(str.split(""))
//                .filter(s -> str.indexOf(s) == str.lastIndexOf(s))
//                .findFirst()
//                .ifPresent(System.out::println);
//        // 2 group by count and get first one when value = 1
//        Arrays.stream(str.trim().split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,  Collectors.counting()))
//                .entrySet().stream()
//                .filter(e -> e.getValue() == 1)
//                .findFirst().map(stringLongEntry -> stringLongEntry.getKey())
//                .ifPresent(System.out::println);

        // 12 - Given a string, find the first repeated character
//        String str = "strkk";
//        // 1
//        Arrays.stream(str.split(""))
//                .filter(s -> str.indexOf(s) != str.lastIndexOf(s) )
//                .findFirst().ifPresent(System.out::println);
//        // 2
//        String str = "strkk";
//        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream().filter(e -> e.getValue() > 1)
//                .findFirst().ifPresent(stringLongEntry -> System.out.println(stringLongEntry.getKey()));

        // 13 - Given an array of integers, group the numbers by the range
//        int [] nums = {1,55,6,99,7,44,5,23,11,15,52,22};
//        Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.groupingBy(num -> num%10*10 , TreeMap::new ,  Collectors.toList()))
//                .forEach((integer, integers) -> System.out.println(integer  + " " + integers));

        // 14 - Given a list of strings, create a list that contains only integers
//        String arr[] ={"ahmed" , "123" , "eslam" , "569"};
//        Arrays.stream(arr)
//                .filter(s -> s.matches("[0-9]+") )
//                .mapToInt(Integer::parseInt)
//                .forEach(System.out::println);

        // 15 - Find the products of the first two elements in an array
//        int[] nums = {1, 55, 6, 99, 7, 44, 5, 23, 11, 15, 52, 22};
//        System.out.println(Arrays.stream(nums)
//                .limit(2)
//                .sum());
//        // 2 -
//        System.out.println(Arrays.stream(nums)
//                .limit(2)
//                .reduce((a, b) -> a + b).orElseGet(() -> 0));

        // 16 - Group /Pair anagrams from a list of Strings.
//        String str[] = {"pat", "tap", "meat", "team", "thrree", "three"};
//        // expected output to be [[pat , tab] , [meat , team] , [three]]
//        Arrays.stream(str)
//                .collect(Collectors.groupingBy(s ->
//                                Arrays.stream(s.split("")).sorted().reduce((s1, s2) -> s1 + s2).get(),
//                        LinkedHashMap::new
//                        , Collectors.toList()))
//                .entrySet().stream().forEach(stringListEntry -> System.out.print(stringListEntry.getValue()));

        // 17 - Write a stream program to multiply alternative numbers in an array
//        int [] a = {1,2,3,4,5};
//        // expected output : 1*3*5*7*9 -> we get range from 0 to a.length then filter only based on value%2==0 then get values in these indexes and reduced
//        IntStream.range(0, a.length).filter(value -> value%2==0)
//                .map(value -> a[value]).reduce((x,y) -> x*y)
//                .ifPresent(System.out::println);

//        // 18 - Write a program to multiply 1st and last element, 2nd and 2nd last element etc
//        int []a = {1,2,3,4,6,7,8,9};
//        // expected output : 1*9 , 2*8 , 3*7 , 4*6
//        IntStream.range(0, a.length/2)
//                .map(index -> a[index] * a[a.length - index-1])
//                .forEach(System.out::println);

        // 19 - Write a stream program to move all zero’s to beginning of array
//        int[] a = {1, 2, 3, 0, 5, 0, 7, 0, 9};
        // 1
//        List<Integer> zeros = Arrays.stream(a).boxed().filter(value -> value == 0).collect(Collectors.toList());
//        List<Integer> notZeros = Arrays.stream(a).boxed().filter(integer -> integer != 0).collect(Collectors.toList());
//        List.of(zeros, notZeros).stream().flatMap(integers -> integers.stream()).forEach(integers -> System.out.print(integers));

//        System.out.println();
        // 2 - group by false = zero , then flatmap result into one list
//        Arrays.stream(a).boxed()
//                .collect(Collectors.partitioningBy(num -> num != 0, Collectors.toList()))
//                .entrySet().stream().flatMap(entry -> entry.getValue().stream())
//                .forEach(num -> System.out.print(num));

        // 20 - In a given array of integers, return true if it contains distinct
//        int[] a = {1, 2, 3, 0, 5, 7, 9 , 0};
//        // 1
//        System.out.println(Arrays.stream(a).boxed()
//                .distinct().count() == a.length);
//        // 2
//        System.out.println(
//                Arrays.stream(a).boxed()
//                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                        .entrySet().stream().filter(e -> e.getValue() > 1)
//                        .count() == 0);

        // 21 -  Given the string[] group the strings based on the middle character
//        String str[] = {"pat", "tap", "meat", "team", "thrree", "three"};
//        Arrays.stream(str)
//                .collect(Collectors.groupingBy( s -> s.charAt(s.length()/2), Collectors.toList()))
//                .entrySet()
//                .stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        // 22 - Find the sum of all the elements in a list
//        int[] a = {1, 2, 3, 0, 5, 7, 9, 0};
//        System.out.println(Arrays.stream(a)
//                .sum());

        // 23 - Sort a list of strings in alphabetical order
//        String str[] = {"pat", "tap", "meat", "team", "thrree", "three"};
//        Arrays.stream(str)
//                .sorted()
//                .forEach(System.out::println);


        // 24 - Convert a list of integers to a list of their squares
//        int[] a = {1, 2, 3, 0, 5, 7, 9, 0};
//        Arrays.stream(a)
//                .map(x -> x * x)
//                .forEach(System.out::println);

        // 25 -  Find and print the distinct odd numbers
//                int[] a = {1, 2, 3, 3, 0, 5, 7, 9, 0};
//        Arrays.stream(a)
//                .distinct()
//                .filter(i -> i % 2 != 0)
//                .forEach(System.out::println);

        // 26 - Find the union of two lists of integers
//        int[] a = {1, 2, 3, 3, };
//        int[] b = {0, 5, 7, 9, 0 };
//        Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed())
//                .forEach(System.out::println);

        // 27 - Find the kth smallest element in a list of integers
//        int[] a = {1, 2, 3, 4};
//        int k = 1;
//        Arrays.stream(a).boxed()
//                .sorted().skip(k)
//                .findFirst()
//                .ifPresent(System.out::println);

        // 28 - Remove all non-numeric characters from a list.
//        String str[] = {"pat5", "ta10p", "m55eat", "te6am", "thrr66ee", "thr77ee"};
//        Arrays.stream(str).map(x -> x.replaceAll("[^0-9]+", "")).
//                forEach(System.out::print);

        // 29 - Find and print strings containing only digits
//        String str[] = {"pat5", "ta10p", "m55eat", "55", "22", "thr77ee"};
//        Arrays.stream(str)
//                .filter(s -> s.matches("[0-9]+"))
//                .forEach(System.out::println);

//        30 - Convert a list of strings to uppercase
//        String str[] = {"pat5", "ta10p", "m55eat", "55", "22", "thr77ee"};
//        Arrays.stream(str).map(String::toUpperCase).forEach(System.out::println);

        // 31 - Calculate the average of all the numbers
//        int[] a = {1, 2, 3, 4};
//        Arrays.stream(a)
//                .average()
//                .ifPresent(System.out::println);

        // 32 - Find the intersection of two lists using Java streams
//        String str1[] = {"pat5", "ta10p", "m55eat", "55", "22", "thr77ee"};
//        String str2[] = {"pa1t5", "ta110p", "m551eat", "55", "22", "thr717ee"};
//        List<String> list = Arrays.asList(str2);
//        Arrays.stream(str1)
//                .filter(list::contains)
//                .forEach(System.out::println);

        // 33 - Find the occurrence of domains using Java streams
//        Employee  employee1= new Employee("ahmed" , "ahmed@gmail.com");
//        Employee  employee2= new Employee("mohamed" , "ahmed@gmail.com");
//        Employee  employee3= new Employee("islam" , "islam@yahoo.com");
//        Employee  employee4= new Employee("mahmoud" , "mahmoud@yahoo.com");
//        Employee  employee5= new Employee("mahmoud" , "mahmoud@yahoo.com");
//        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4 , employee5);
//        employees.stream()
//                .map(employee -> employee.email().substring(employee.email().indexOf("@")+1 , employee.email.lastIndexOf(".")))
//                .collect(Collectors.groupingBy(Function.identity(),TreeMap::new , Collectors.counting()))
//                .entrySet().stream().forEach(System.out::println);


        // 34 - Generate the first 10 numbers of the Fibonacci Sequence
        // imparative
//        int a = 0;
//        int b = 1;
//        System.out.print(a + " , ");
//        for (int i = 1; i < 10; i++) {
//            System.out.print(b + " , ");
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }


        // stream iterate
//        Stream.iterate(0, i -> i + 2)
//                .limit(10).forEach(System.out::println);
//        Stream.iterate(0, n -> n < 10, n -> n + 2)
//                .forEach(System.out::println);
        // declarative -> stream
//        System.out.println();
//        Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1], ints[0] + ints[1]})
//                .limit(10)
//                .map(ints -> ints[0]+" , ")
//                .forEach(System.out::print);

        // 35 - Convert list of integers to a list of their squares(Theory)
//        int[] a = {1, 2, 3, 4};
//        Arrays.stream(a)
//                .map(x -> x * x)
//                .forEach(System.out::println);

        // 36 - Transform Person object stream into a single string
//        Employee  employee1= new Employee("ahmed" , "ahmed@gmail.com");
//        Employee  employee2= new Employee("mohamed" , "ahmed@gmail.com");
//        Employee  employee3= new Employee("islam" , "islam@yahoo.com");
//        Employee  employee4= new Employee("mahmoud" , "mahmoud@yahoo.com");
//        Employee  employee5= new Employee("mahmoud" , "mahmoud@yahoo.com");
//        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4 , employee5);
//        String collect = employees.stream().map(employee -> employee.name.toUpperCase())
//                .collect(Collectors.joining(" | "));
//        System.out.println(collect);


        // 37 - Group list of strings by their first character and count the number of strings
//        String str1[] = {"pat5", "ta10p", "m55eat", "55", "22", "thr77ee"};
//        for (Map.Entry<String, Long> stringLongEntry : Arrays.stream(str1)
//                .collect(Collectors.groupingBy(s -> s.substring(0, 1), Collectors.counting()))
//                .entrySet()) {
//            System.out.println(stringLongEntry.getKey() + " " + stringLongEntry.getValue());
//        }

        // 38 - Convert a list to a map
//        Employee  employee1= new Employee("ahmed", "ahmed@gmail.com");
//        Employee employee2 = new Employee("mohamed", "ahmed@gmail.com");
//        Employee employee3 = new Employee("islam", "islam@yahoo.com");
//        Employee employee4 = new Employee("mahmoud", "mahmoud@yahoo.com");
//        Employee employee5 = new Employee("mahmoud", "mahmoud@yahoo.com");
//        List<Employee> employees = Arrays.asList(employee1,employee2,employee3,employee4 , employee5);
//        TreeMap<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(employee -> employee.email, TreeMap::new, Collectors.toList()));
//        System.out.println(collect);

        // 39 - Multiply array elements(Conceptual)
        int[] a = {1, 2, 3, 4};
        Arrays.stream(a)
                .boxed().reduce( (x, y) -> x * y)
                .ifPresent(System.out::println);

        // 40 - Can we reuse stream in Java 8 ?


        //  other examples
        // 1 - even numbers from 1 - 10
//        Stream.iterate(0, n -> n < 10, n -> n + 2)
//                .forEach(System.out::print);

        // 2 - power of 2
//        System.out.println();
//        Stream.iterate(1, n -> n * 2)
//                .limit(10)
//                .forEach(aa -> System.out.print(aa.intValue() + " , "));

        // 3 - alphabit chars only 5
//        System.out.println();
//        Stream.iterate('A', n -> (char) (n + 1))
//                .limit(5)
//                .forEach(aa -> System.out.print(aa + " , "));

    }

    record Employee(String name, String email) {

    }

    public static int wordCoun(String str) {

        String vowels = "aeiouAEIOU";

        return (int) str.chars().filter(s -> vowels.indexOf(s) != -1).count();

    }
}
