package Threading;

class AddThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread-A : " + i + " Hi");
        }
    }
}

class SubThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread-B : " + i + " Hello");
        }
    }
}

public class Thread2 {

    public static void main(String[] args) {


        AddThread a = new AddThread();
        SubThread b = new SubThread();


        System.out.println(a.getPriority());
        a.setPriority(Thread.MIN_PRIORITY);
        System.out.println(a.getPriority());
        a.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a.getPriority());

        a.start();
        b.start();
    }
}
