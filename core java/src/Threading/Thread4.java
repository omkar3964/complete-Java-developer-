package Threading;


public class Thread4 {
    public static void main(String[] args) {

        Runnable r1 = () -> {

                for(int i=0 ; i<10 ; i++){
                    System.out.println("Task-A   : " + i);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


        };

        Runnable r2 = () -> {
                for(int i=0 ; i<10 ; i++){
                    System.out.println("Task-B : " + i);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();


    }
}
