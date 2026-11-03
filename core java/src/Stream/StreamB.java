package Stream;
import java.util.*;

public class StreamB {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Omkar");
        students.put(102, "Rahul");
        students.put(103, "Amit");
        students.put(104, "Priya");

        students.entrySet()
                .stream()
                .filter(entry -> entry.getKey() > 102)
                .forEach(entry ->
                        System.out.println(
                                entry.getKey() + " : " + entry.getValue()
                        )
                );
    }
}