package problems.functionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class _TestStream {

    static class Person {
        String name ;
        int age ;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {

        List<Person> peoples = List.of(
                new Person("Ali", 25),
                new Person("Sara", 16),
                new Person("Omar", 30)
        );

        // give adult person that age > 18 -> predicate
//        peoples.stream().filter(person -> person.getAge() > 18).
//                forEach(person -> System.out.println(person.getName()));

        // transfer names -> function
        peoples.stream().map( person -> person.name)
                .forEach( s -> System.out.println(s));


        // print each person -> consumer
        peoples.stream().forEach( person -> System.out.println(person.name));



    }
}
