package p6;

public class Book {

    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static int compare(Book book1, Book book2) {
        if (book1.getPrice() > book2.getPrice())
            return 1;
        return -1;
    }
}
