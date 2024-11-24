package structural.bridgePattern.code;

public class RectangleShape extends Shape {
    public RectangleShape(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Rectangle");

        color.applyColor();
    }
}
