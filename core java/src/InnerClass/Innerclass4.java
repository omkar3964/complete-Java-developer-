package InnerClass;
abstract class Vehicle{
    public abstract void show();
    public abstract void sound();
}

public class Innerclass4 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle() {
            @Override
            public void show() {
                System.out.println("Car can show");
            }

            @Override
            public void sound() {
                System.out.println("Car can sound");

            }
        };

        v1.show();
        v1.sound();
    }
}
