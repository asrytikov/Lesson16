package p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Alex", "Nick", "Marya", "Ivan", "Sergey"}));
        int pageSize = 4;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Input number of page");
            int page = scanner.nextInt();
            if (page<1)break;
            names.stream().skip((page-1)*pageSize)
                    .limit(pageSize)
                    .forEach(System.out::println);
        }
    }

}
