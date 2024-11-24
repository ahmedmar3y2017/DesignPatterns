package creational.protoTypePattern.code;

public class main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Rabbit rabbit = new Rabbit("nnn", "20");
        rabbit.setOwner(new Person("ahmed"));
        System.out.println(rabbit.toString());
        // clone prototype
        Rabbit rabbitNew = rabbit.clone();
        rabbitNew.setName("New Rabbit");
        rabbitNew.getOwner().setName("mohamed");
        System.out.println(rabbitNew.toString());

        System.out.println(rabbit.toString());

    }
}
