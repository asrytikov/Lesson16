package p1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1,2,3, -4, -5);
        //numbers.sorted().takeWhile(n-> n<0).forEach(System.out::println);

        numbers.sorted().dropWhile(n-> n<0).forEach(System.out::println);

        Stream<String> people1 = Stream.of("Tom", "Alex", "Nick");
        Stream<String> people2 = Stream.of("Ivan", "Alexey", "Sergey");

        Stream.concat(people1, people2).forEach(System.out::println);

        System.out.println("--------------------");

        Stream<String> peoples = Stream.of("Tom", "Alex", "Nick", "Tom", "Ivan", "Ivan");
        peoples.distinct().forEach(System.out::println);

        System.out.println("--------------------");

        Stream<String> peoples2 = Stream.of("Tom", "Alex", "Nick", "Tom", "Ivan", "Ivan");

        peoples2.skip(1).limit(3).forEach(System.out::println);



    }
}