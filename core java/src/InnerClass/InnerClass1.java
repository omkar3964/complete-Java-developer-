package InnerClass;

class Car {
        private String model = "Mahindra";
        class Engine{
                public void display(){
                        System.out.println("Inner Engine Model : " + model);
                }
        }
}

public class InnerClass1 {
        public static void main(String[] args) {
                Car c = new Car();
//                Inner e = new Inner();
                Car.Engine  e = c.new Engine();
                e.display();

        }
}
