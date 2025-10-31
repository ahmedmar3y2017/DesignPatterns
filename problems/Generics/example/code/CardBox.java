package problems.Generics.example.code;

public class CardBox<T extends Boxable> extends Box<T> {

    public double getWeight(){
        return super.getLastItem().getWeight();
    }
}
