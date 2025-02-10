package creational.protoTypePattern.code;

import java.io.Serializable;

public class main {

    public static void main(String[] args) throws CloneNotSupportedException {
//        Rabbit rabbit = new Rabbit("nnn", "20");
//        rabbit.setOwner(new Person("ahmed"));
//        System.out.println(rabbit.toString());
//        // clone prototype
//        Rabbit rabbitNew = rabbit.clone();
//        rabbitNew.setName("New Rabbit");
//        rabbitNew.getOwner().setName("mohamed");
//        System.out.println(rabbitNew.toString());
//
//        System.out.println(rabbit.toString());

        Person person = new Person("ahmed");

        Person clone = person.clone();

        System.out.println(person.getName());
        System.out.println(clone.getName());

        person.setName("mohamed");
        System.out.println(person.getName());
        System.out.println(clone.getName());


        System.out.println(person instanceof Cloneable);
        System.out.println(person instanceof Serializable);

    }
}
