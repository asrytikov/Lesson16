package p6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5);
        Optional<Integer> result = numbersStream.reduce((x, y) -> x+y);
        System.out.println(result.get());

        Stream<String> wordsStream = Stream.of("Java", "is", "best");
        System.out.println(wordsStream.reduce((x, y)-> x + " " + y).get());

        Stream<Integer> numbersStream2 = Stream.of(1,2,3,4,5);
        int ident = 1;
        int res = numbersStream2.reduce(ident, (x, y) -> x*y);
        System.out.println(res);

        ArrayList<Book> books = new ArrayList<>();
        books.addAll(Arrays.asList(new Book[] {
                new Book("Java", 1000),
                new Book("Java EE", 2000),
                new Book("Thinking of Java", 1500)
        }));

        int sum = books.stream().reduce(0,
                (x,y) -> {
                    if (y.getPrice()>=1500){
                        return x+y.getPrice();
                    }else{
                        return x+0;
                    }
                },
                (x, y)->x+y
        );

        System.out.println(sum);


    }

}
