
package Collection;

import java.util.*;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Insertion
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addLast(40);

        System.out.println("Deque: " + dq);

        // Retrieve
        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());

        // Remove
        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removal: " + dq);

        // Check
        System.out.println(dq.contains(10));

        // Iterate
        for (Integer value : dq) {
            System.out.println(value);
        }
    }
}
