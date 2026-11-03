package Collection;

import java.util.*;

public class MapExample {
    public static void main(String[] args){
        Map<Integer, String> m = new HashMap<>();

        m.put(101, "Omkar");
        m.put(102, "Vaibhav");
        m.putIfAbsent(103, "Arun");
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
    }


}
