package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample {
    public static void main(String[] args) {

        HashSet<Integer> s = new HashSet<>();
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(3);
        s.add(55);
        s.add(312);





        System.out.println(s);
        System.out.println(s.contains(3));
        System.out.println(s.size());

    }

}
