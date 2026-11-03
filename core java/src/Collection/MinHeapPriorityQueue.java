package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeapPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(23);
        q.offer(35);

        q.add(3);
        q.offer(5);

        System.out.println(q);

        System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q.remove());
        System.out.println(q.poll());

        System.out.println("THis is latest q" + q);
    }
}
