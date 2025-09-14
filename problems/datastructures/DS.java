package problems.datastructures;

import java.util.*;

public class DS {

    public static void main(String[] args) {

        List<String> strings = List.of("a", "b", "c");


        System.out.println(strings);


        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        System.out.println("------------------------- ");
        Queue queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());

        System.out.println("--------------------- Linked List ----------- ");
        LinkedList linkedList = new LinkedList();
        linkedList.offer("a");
        linkedList.offer("b");
        linkedList.offer("c");
        System.out.println(linkedList.peek());
        System.out.println(linkedList.size());
        System.out.println(linkedList.pop());


        System.out.println("------------------------ Set ------------------ ");

        Set<person> set = new HashSet<>();
        set.add(new person("ahmed"));
        set.add(new person("mohamed"));
        set.add(new person("ahmed"));
        set.add(new person("youssef"));
        // sort
        set.stream().sorted(Comparator.comparing(person -> person.name)).forEach(System.out::println);

        System.out.println("------------------------ Set Sorted------------------ ");

        Set<person> setSorted = new TreeSet<>();
        setSorted.add(new person("ahmed"));
        setSorted.add(new person("mohamed"));
        setSorted.add(new person("ahmed"));
        setSorted.add(new person("youssef"));

        setSorted.forEach(System.out::println);

        System.out.println("------------------------ HashMap -------------- ");

        Map<Integer, person> map = new HashMap<>();
        map.put(1, new person("ahmed"));
        map.put(3, new person("ddd"));
        map.put(4, new person("youssef"));
        map.put(2, new person("mohamed"));

        System.out.println(map.keySet());
        System.out.println(map.values());

        map.forEach((integer, person) ->
                System.out.println("Key: " + integer + " Value: " + person.name));

        System.out.println("-------------------- Sorted ");
        map.entrySet().stream().sorted((o1, o2) ->
                        o1.getKey().compareTo(o2.getKey())
                )
                .forEach(integerpersonEntry -> System.out.println("Key: " + integerpersonEntry.getKey() + " Value: " + integerpersonEntry.getValue()));

        // HashCode , hashmap , object as a map key
        System.out.println("----------------------- HashCode , hashmap , object as a map key  ");

        // when override hashcode -> hashcode for person that has tha same name of other is equal
        // so override when key = person the same
        Map<person , String> personStringMap = new HashMap<>();
        personStringMap.put(new person("ahmed"), "ahmed");
        personStringMap.put(new person("mohamed"), "mohamed");
        personStringMap.put(new person("mohamed"), "eslam");

        System.out.println(personStringMap.get(new person("ahmed")));
        personStringMap.entrySet().forEach(System.out::println);

    }

    //    record person(String name) {
//    }
//
    static class person implements Comparable<person> {

        String name;

        public person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object object) {
            if (object == null || getClass() != object.getClass()) return false;
            person person = (person) object;
            return Objects.equals(name, person.name);
        }
//
        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }


        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(person o) {
            return this.name.compareTo(o.name);
        }
    }
}
