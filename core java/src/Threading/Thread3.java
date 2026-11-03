package Threading;

class Task1 implements Runnable{
    @Override
    public void run(){
        for(int i=0 ; i<10 ; i++){
            System.out.println("Task-1 : " + i);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Task2 implements Runnable{
    @Override
    public void run(){
        for(int i=0 ; i<10 ; i++){
            System.out.println("Task-2 : " + i);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread3 {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();


        Thread a = new Thread(t1);
        Thread b = new Thread(t2);

        a.start();
        b.start();

    }
}
