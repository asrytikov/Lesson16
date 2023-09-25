package p7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        Optional<Integer> min = num.stream().min(Integer::compare);
        if (min.isPresent()){
            System.out.println(min.get());
        }
        //System.out.println(min.orElseThrow(IllegalStateException::new));
        //System.out.println(min.orElse(-1));
        Random random = new Random();
        System.out.println(min.orElseGet(()->random.nextInt(100)));

        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        Optional<Integer> min2 = stream.min(Integer::compare);
        min2.ifPresent(System.out::println);

        min2.ifPresentOrElse(
                System.out::println,
                ()-> System.out.println("Value not found")
        );












    }
}
