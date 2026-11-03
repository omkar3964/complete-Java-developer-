package Threading;

public class Thread1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());
        System.out.println(Thread.currentThread());
    }
}
