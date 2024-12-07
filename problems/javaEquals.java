package problems;

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof Student))
            return false;

        Student student = (Student) obj;
        return student.age == this.age && student.name == this.name;

    }
}

/**
 * Violating equals() Symmetry With Inheritance
 * If the criteria for .equals() is such common sense,
 * then how can we violate it at all? Well, violations of the .equals()
 * contract are more likely to occur when we extend a class that has
 * overridden the .equals() method as well
 */

/*
*
* 2.4. Fixing equals() Symmetry With Composition
To avoid making mistakes, we should favor composition over inheritance.

Instead of subclassing Money, let’s create a Voucher class with a Money property:


*
* */
public class javaEquals {

    public static void main(String[] args) {

        Student student2;
        Student student1 = new Student("John Doe", 18);
        student2 = student1;
        System.out.println(student1.equals(student2));
        System.out.println("student1 : " + student1.hashCode() + " student2 : " + student2.hashCode());

        student2 = new Student("John Doe", 18);
        System.out.println(student1.equals(student2));
        System.out.println("student1 : " + student1.hashCode() + " student2 : " + student2.hashCode());
        student2.age = 20;
        System.out.println(student1.equals(student2));
        // hashcode
        System.out.println("student1 : " + student1.hashCode() + " student2 : " + student2.hashCode());
    }
}
