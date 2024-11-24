package structural.bridgePattern.code;

public class main {

    public static void main(String[] args) {

        Shape circle = new CircleShape(new GreenColor());
        Shape rec = new RectangleShape(new RedColor());

        circle.applyColor();
        rec.applyColor();
    }
}
