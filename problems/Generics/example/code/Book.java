package problems.Generics.example.code;

public class Book implements Boxable {
    @Override
    public double getWeight() {
        return 0;
    }

    String bookName;
    double price;
    public Book(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
