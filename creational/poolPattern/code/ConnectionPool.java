package creational.poolPattern.code;

public class ConnectionPool extends ObjectPool<Connection> {


    @Override
    public Connection create() {
        return new Connection();
    }
}
