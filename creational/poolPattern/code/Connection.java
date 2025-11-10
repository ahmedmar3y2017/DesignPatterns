package creational.poolPattern.code;

public class Connection {
    public static int count;
    public int id = ++count;

    public void connect() {
        System.out.println("Connection " + id + " connected");
    }
}
