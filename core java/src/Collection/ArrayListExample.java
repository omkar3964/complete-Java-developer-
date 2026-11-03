package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(14);
        numbers.add(17);
        numbers.add(6);

        numbers.add(3, 25);


        System.out.println(numbers);
        System.out.println(numbers.get(3));

        System.out.println(numbers.contains(25));


        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
