package structural.ProxyPattern.example;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    public void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void diaplay() {

        System.out.println("Real Image Display");
    }
}
