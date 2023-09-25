package p8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(new Book[] {
                new Book("Java", 1000, "Ekkel"),
                new Book("Java EE", 2000, "Blosh"),
                new Book("Thinking of Java", 1500, "Ekkel")
        }));


        Map<String, List<Book>> booksByAuthor = books.stream().collect(Collectors.groupingBy(Book::getAuthor));
        for(Map.Entry<String, List<Book>> item : booksByAuthor.entrySet()){
            System.out.println(item.getKey());
            for(Book book: item.getValue()){
                System.out.println(book.getName());
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        Map<Boolean, List<Book>> booksByAuthor2 = books.stream()
                .collect(Collectors.partitioningBy(a -> a.getAuthor()=="Ekkel"));

        for(Map.Entry<Boolean, List<Book>> item: booksByAuthor2.entrySet()){
            System.out.println(item.getKey());
            for(Book book: item.getValue()){
                System.out.println(book.getName());
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        Map<String, Long> booksByAuthor3 = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        for(Map.Entry<String, Long> item: booksByAuthor3.entrySet()){
            System.out.println(item.getKey() + " - "+ item.getValue());
        }

        System.out.println("-------------------------------");
        Map<String, Integer> booksByAuthor4 = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.summingInt(Book::getPrice)));
        for(Map.Entry<String, Integer> item: booksByAuthor4.entrySet()){
            System.out.println(item.getKey() + " - "+ item.getValue());
        }

        System.out.println("-------------------------------");
        Map<String, Optional<Book>> booksByAuthor5 = books.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.minBy(Comparator.comparing(Book::getPrice))));
        for(Map.Entry<String, Optional<Book>> item: booksByAuthor5.entrySet()){
            System.out.println(item.getKey() + " - "+ item.getValue().get().getName());
        }


    }

}
