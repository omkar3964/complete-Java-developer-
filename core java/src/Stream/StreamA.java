package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamA {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(12, 3,22, 8, 65,23,78,345, 8, 67);
        int result = lst.stream().filter(n -> n<30).reduce(0,(a,b)->a+b);

        System.out.println(result);

        lst.stream().filter(n -> n%2 == 0)
                .distinct()
                .sorted().forEach(System.out::println);




    }
}
