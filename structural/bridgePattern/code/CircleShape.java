package structural.bridgePattern.code;

public class CircleShape extends Shape {

    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {

        System.out.println("Circle");
        color.applyColor();
    }
}
