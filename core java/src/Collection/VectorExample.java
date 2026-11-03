package Collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(23);
        v.add(21);
        v.add(2);
        v.addElement(42);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());

        System.out.println(v.getFirst());
        System.out.println(v.lastElement());
    }


}
