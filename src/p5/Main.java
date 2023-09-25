package p5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(new Book[] {
                new Book("Java", 1000),
                new Book("Java EE", 2000),
                new Book("Thinking of Java", 1500)
        }));

        Book min = books.stream().min(Book::compare).get();
        Book max = books.stream().max(Book::compare).get();

        System.out.printf("Min price book name: %s, price: %s \n", min.getName(), min.getPrice());
        System.out.printf("Max price book name: %s, price: %s \n", max.getName(), max.getPrice());

    }

}
