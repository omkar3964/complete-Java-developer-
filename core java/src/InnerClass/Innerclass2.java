package InnerClass;

class Car1 {
    static String model = "Mahindra";

    static class Engine1 {
        public void display() {
            System.out.println("Inner Engine Model : " + model);
        }
    }
}

public class Innerclass2 {
    public static void main(String[] args) {
        Car1.Engine1 e = new Car1.Engine1();
        e.display();
    }
}
