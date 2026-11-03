package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxHeapPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        q.add(23);
        q.offer(35);

        q.add(3);
        q.offer(5);

        System.out.println(q);

        System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.contains(4));

        System.out.println("THis is latest q" + q);
    }
}
