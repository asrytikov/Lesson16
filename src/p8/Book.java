package p8;

public class Book {

    private String name;
    private int price;
    private String author;


    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getAuthor() {
        return author;
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
