package oops;
abstract class Car{
    public abstract void drive();
    public abstract void show();
    public void playMusic(){
        System.out.println("Playing songs");
    }
}
abstract class WagonR extends Car{

    @Override
    public void drive() {
        System.out.println("Drive from WagonR");
    }

}
class AdvanceWagonR extends WagonR{
    @Override
    public void show() {
        System.out.println("Show from AdvanceWagonR");
    }
}

public class Abstraction {
    public static void main(String[] args) {

    }
}
