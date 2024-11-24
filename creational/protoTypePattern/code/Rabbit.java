package creational.protoTypePattern.code;

public class Rabbit implements Cloneable {

    String name;
    String age;

    Person owner;

    Rabbit(String name,
           String age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    protected Rabbit clone() throws CloneNotSupportedException {
        // avoid immutable
        Rabbit clone = (Rabbit) super.clone();
        clone.setOwner(owner.clone());

        return clone;

    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", owner=" + owner +
                '}';
    }
}
