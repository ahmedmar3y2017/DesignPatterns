package creational.poolPattern.code;

public class mainClass {

    public static void main(String[] args) {

        ConnectionPool pool = new ConnectionPool();

        Connection connection1 = pool.getObject();
        Connection connection2 = pool.getObject();
        connection1.connect();
        connection2.connect();

        System.out.println("Available NOw : " + pool.available.size());
        pool.releaseObject(connection1);
        pool.releaseObject(connection2);

        System.out.println("Available NOw : " + pool.available.size());


    }
}
