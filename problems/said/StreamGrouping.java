package problems.said;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrouping {

    static class Person {
        String name;
        String city;
        int age;

        Person(String name, String city, int age) {
            this.name = name;
            this.city = city;
            this.age = age;
        }

        String getCity() {
            return city;
        }

        int getAge() {
            return age;
        }

        public String toString() {
            return name + " (" + age + ")";
        }
    }

    // create function for age classification
    static String getAgeGroup(int age) {
        if (age < 18) return "Child";
        else if (age < 30) return "Young";
        else return "Adult";
    }

    public static void main(String[] args) {

        // ex6 :
//        Desired Output Structure:
//        {
//            "Cairo": {
//            "Young": [Alice, Bob],
//            "Adult": [Charlie]
//        },
//            "London": {
//            "Adult": [Dave]
//        }
//        }

        List<Person> people = List.of(
                new Person("Alice", "Cairo", 25),
                new Person("Bob", "Cairo", 22),
                new Person("Charlie", "Cairo", 34),
                new Person("Dave", "London", 32),
                new Person("Eva", "London", 16)
        );

        Map<String, List<Person>> stringListMap = people.stream().collect(Collectors.groupingBy(
                person -> person.getCity()
        ));
        System.out.println(stringListMap);

        Map<String, Map<String, List<Person>>> collect = people.stream().collect(Collectors.groupingBy(
                person -> person.getCity(),
                Collectors.groupingBy(o -> getAgeGroup(o.getAge()))
        ));

        System.out.println(collect);

    }
}
