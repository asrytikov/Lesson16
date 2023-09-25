package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Alex", "Nick", "Marya", "Ivan", "Sergey"}));
        System.out.println(names.stream().count());
        System.out.println(names.stream().filter(n->n.length()==4).count());

        Optional<String> first = names.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = names.stream().findAny();
        System.out.println(any.get());

        boolean all = names.stream().allMatch(s -> s.length()>2);
        System.out.println(all);

        boolean anyMatch = names.stream().anyMatch(s -> s.length()>5);
        System.out.println(anyMatch);

        boolean none = names.stream().noneMatch(s -> s=="Ivan");
        System.out.println(none);









    }

}
