package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();

        lst.add("Omkar");
        lst.add("Sarthak");

        lst.addFirst("Arun");
        lst.addLast("Avinash");

        Iterator<String> itr = lst.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println(lst.getFirst());
        System.out.println(lst.getLast());

        lst.removeFirst();
        lst.removeLast();

        System.out.println(lst);
    }
}
