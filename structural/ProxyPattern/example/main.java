package structural.ProxyPattern.example;

public class main {

    public static void main(String[] args) {

        Image image = new ImageProxy("/ahmed.png");
        image.diaplay();
        image.diaplay();
    }
}
