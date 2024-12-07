package structural.ProxyPattern.example;

public class ImageProxy implements Image {
    private RealImage image;
    private String filename;

    public ImageProxy(String filename) {

        this.filename = filename;
    }

    @Override
    public void diaplay() {

        if (image == null) {
            image = new RealImage(this.filename);
        }

        image.diaplay();

    }
}
