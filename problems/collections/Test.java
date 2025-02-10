package problems.collections;

import java.util.*;

public class Test {

    static class Student {

        String name ;
        int age ;

        Student(String name , int age ){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {

        Student student1=new Student("ahmed" , 50 );
        Student student2=new Student("mohamed" , 20 );
        Student student3=new Student("islam" , 30 );

        Deque<Student> queue = new ArrayDeque<>();
        queue.push(student1);
        queue.push(student2);
        queue.push(student3);

        System.out.println(queue.peek());
        queue.pop();

        queue.stream().forEach(System.out::println);
    }
}
