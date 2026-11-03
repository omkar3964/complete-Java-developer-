package Stream;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(10,20, 43, 17, 39, 56, 98);

        list.stream().filter(n -> n>30).forEach(System.out::println);
    }
}
