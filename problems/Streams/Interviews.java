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
//        int[] a = {1, 2, 3, 4};
//        Arrays.stream(a)
//                .boxed().reduce( (x, y) -> x * y)
//                .ifPresent(System.out::println);

        // 40 - Can we reuse stream in Java 8 ?

        // 41 - Convert a list of string to uppercase and then concatenate
//        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
//        // 1
//        System.out.println(Arrays.stream(arr)
//                .collect(Collectors.mapping(s -> s.toUpperCase(), Collectors.joining(" "))));
//        // 2
//        Arrays.stream(arr).map(s -> s.toUpperCase()).reduce((a, b) -> a + " " + b)
//                .ifPresent(System.out::println);

        // 42 -Concatenate 2 streams
//        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
//        String[] arr1 = {"a", "b", "c", "d", "e", "f", "g", "h"};
//        Stream.concat(Arrays.stream(arr1), Arrays.stream(arr))
//                .forEach(System.out::println);

        // 45 - list to array
//        List<String> list = List.of("a", "b", "c");
//        String[] array = list.stream().toArray(String[]::new);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        // 46 - find min , max by comparator
//        int[] a = {1, 2, 3, 4};
//        OptionalInt min = Arrays.stream(a).min();
//        System.out.println(min);
//        OptionalInt max = Arrays.stream(a).max();
//        System.out.println(max);
//        // comparator
//        System.out.println(Arrays.stream(a).boxed().min(Integer::compareTo).get());
//        System.out.println(Arrays.stream(a).boxed().max(Integer::compareTo).get());


        // 47 - generate random 5 num
//        Stream.generate(() -> Math.random()).limit(5).forEach(System.out::println);

//        // 48 - generate 5 num iterate over a function
//        Stream.iterate(0 ,integer -> integer + 1  )
//                .limit(5)
//                .forEach(System.out::println);

        // 49 - create stream from list of values
//        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
//        stringStream.forEach(System.out::println);

        // 50 - concatenate 2 streams
//        Stream.concat(Stream.of(1), Stream.of(2)).forEach(System.out::println);

        // 51 - reduce element to single values for example -> sum
//        Stream.of(1 , 3 , 6 , 8)
//                .reduce((integer, integer2) -> integer + integer2)
//                .ifPresent(System.out::println);


        // 52 - Print the middle character of a given String -- good
//        String str = "ahmeed";
//        int mid = str.length() / 2;
//        String collect = Stream.iterate(0, integer -> integer + 1)
//                .limit(str.length())
//                .filter(integer -> {
////                    if even
//                    if (str.length() % 2 == 0) {
//                        if (integer == mid - 1 || integer == mid) {
//                            integer = mid;
//                            return true;
//                        }
//                    } else {
//                        if (integer == mid) {
//                            integer = mid;
//                            return true;
//                        }
//                    }
//                    return false;
//                })
//                .map(integer -> str.charAt(integer))
//                .map(String::valueOf)
//                .collect(Collectors.joining(" ", "{ ", " }"));
//        System.out.println(collect);

        // 53 - Print distinct numbers which starts with "1" in descending order
        // filter start with 1
        // distinct
        // order desc
//        Stream<Integer> stringStream = Stream.of(11, 22, 33, 140, 55, 6, 78, 81, 19);
//        List<Integer> collect1 = stringStream
//                .filter(integer -> String.valueOf(integer).startsWith("1"))
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(collect1);


        // 54 - Return comparison of a Person object based on first name and then last name
//        Employee employee1 = new Employee("ahmed", "mohamed@gmail.com");
//        Employee employee2 = new Employee("ahmed", "ahmed@gmail.com");
//        Employee employee3 = new Employee("islam", "islam@yahoo.com");
//        Employee employee4 = new Employee("mahmoud", "mahmoud@yahoo.com");
//        Employee employee5 = new Employee("mahmoud", "mahmoud@yahoo.com");
//        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
//
//        employees.stream().sorted(Comparator.comparing(Employee::name)
//                .thenComparing(Employee::email)
//
//        ).forEach(employee -> System.out.println(employee.toString()));

        // 55 - Print the count of a particular substring : example string 'byeahmedbyemohamedbye' count bye : output : 3
//        String str = "byeaxamedbyeamoxamedxaea";
//        String search = "xa";
//        System.out.println(Stream.iterate(0, i -> i + 1)
//                .limit(str.length()-search.length()+1)
//                .filter(integer -> str.substring(integer, integer + search.length()).equals(search))
//                .collect(Collectors.counting()).intValue());

        // 56 -  Find the department with maximum people
//        Emp employee2 = new Emp("ahmed", "IT");
//        Emp employee3 = new Emp("islam", "HR");
//        Emp employee4 = new Emp("mahmoud", "IT");
//        Emp employee5 = new Emp("mahmoud", "IT");
//        Emp employee1 = new Emp("ahmed", "HR");
//        List<Emp> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
//        // 1
//       employees.stream().collect(Collectors.groupingBy(emp -> emp.department,LinkedHashMap::new,
//                Collectors.counting()))
//                        .entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue , Comparator.reverseOrder()))
//                .findFirst().ifPresent(System.out::println);
//       // 2
//        employees.stream().collect(Collectors.groupingBy(emp -> emp.department,
//                Collectors.counting()))
//                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue ))
//                .ifPresent(System.out::println);


        // 57 - Find the average salary from each department
//        EmpSal employee2 = new EmpSal("ahmed", "IT" , 50 );
//        EmpSal employee3 = new EmpSal("islam", "HR", 50 );
//        EmpSal employee4 = new EmpSal("mahmoud", "IT", 100 );
//        EmpSal employee5 = new EmpSal("mahmoud", "IT", 50 );
//        EmpSal employee1 = new EmpSal("ahmed", "HR", 50 );
//        List<EmpSal> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
//        employees.stream().collect(Collectors.groupingBy(EmpSal::department , Collectors.averagingDouble(EmpSal::salary)))
//                .forEach((s, aDouble) -> System.out.println(s + " " + aDouble));

        // 58 - Reorder message from format in chronological order
//        List<String> logs = List.of("14:30:20:ahmed ",
//                "14:30:05:eslam",
//                "14:30:02:soma",
//                "14:30:00:lolo",
//                "14:30:03:koko");
//        // 1
//        Map<String, String> collect = logs.stream().collect(Collectors.toMap(s -> s.substring(0, s.lastIndexOf(":")), s -> s.substring(s.lastIndexOf(":") + 1, s.length())));
//        collect.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
//                .forEach(e -> System.out.println(e.getValue()));
//        // 2
//        System.out.println("---------- ");
//        logs.stream().sorted(Comparator.comparing(s -> ((String) s).split(":")[0])
//                .thenComparing(s -> String.valueOf(s).split(":")[1])
//                .thenComparing(s -> String.valueOf(s).split(":")[2])
//        )
//                .map(s -> s.split(":")[3])
//                .forEach(e -> System.out.println(e));


        // 58 - Return character with the maximum frequency
//        String str = "abcdeeffffgdd";
//        // 1
//        Stream.of(str.split(""))
//                .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()  ))
//                .entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue , Comparator.reverseOrder())).
//                findFirst().ifPresent(longEntry -> System.out.println(longEntry.getKey()));
//        // 2
//        Stream.of(str.split(""))
//                .collect(Collectors.groupingBy(Function.identity() ,Collectors.counting()  ))
//                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue ))
//                .map(Map.Entry::getKey)
//                .ifPresent(System.out::println);
        // 59 - Convert list of string into map of String and its equivalent length
//        List<String> strings = Arrays.asList("asdsf", "asdsf", "cff");
//        strings.stream().collect(Collectors.toMap( s -> s, String::length , Integer::max))
//                .entrySet().forEach(System.out::println);

        // 60 - Transform one object into another . Transform Employee to EmployeeDTO
//        EmpSal employee2 = new EmpSal("ahmed", "IT", 50);
//        EmpSal employee3 = new EmpSal("islam", "HR", 50);
//        EmpSal employee4 = new EmpSal("mahmoud", "IT", 100);
//        EmpSal employee5 = new EmpSal("mahmoud", "IT", 50);
//        EmpSal employee1 = new EmpSal("ahmed", "HR", 50);
//        List<EmpSal> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
//        employees.stream().map(empSal -> {
//                            EmpSalDTO emp = new EmpSalDTO(empSal.name, empSal.department, empSal.salary);
//                            return emp;
//                        }
//                )
//                .forEach(empSalDTO -> System.out.println(empSalDTO));

        // 61 - Comparable vs Comparator interface

        // 1 - sort by salary
        EmpSal employee2 = new EmpSal("ahmed", "IT", 200);
        EmpSal employee3 = new EmpSal("islam", "HR", 3000);
        EmpSal employee4 = new EmpSal("mahmoud", "IT", 100);
        EmpSal employee5 = new EmpSal("mahmoud", "IT", 50);
        EmpSal employee1 = new EmpSal("ahmed", "HR", 30);
        List<EmpSal> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
        employees.stream().sorted(EmpSal::compareTo)
                .forEach(System.out::println);
        // 2 -
//        Comparator<EmpSal> empSalComparator = ((o1, o2) -> {
//            return o1.salary > o2.salary ? 1 : -1;
//        });
//        Collections.sort(employees, empSalComparator);
//        System.out.println(employees);
        // 3 - using comparable
//        Collections.sort(employees);
//        System.out.println(employees);


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

    record Emp(String name, String department) {

    }

    record EmpSal(String name, String department, double salary) implements Comparable<EmpSal> {
        @Override
        public String toString() {
            return "EmpSal{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        public int compareTo(EmpSal o) {
            return this.salary > o.salary ? 1 : -1;
        }
    }

    record EmpSalDTO(String name, String department, double salary) {

    }

    public static int wordCoun(String str) {

        String vowels = "aeiouAEIOU";

        return (int) str.chars().filter(s -> vowels.indexOf(s) != -1).count();

    }
}
