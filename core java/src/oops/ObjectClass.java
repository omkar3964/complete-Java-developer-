package oops;
class Laptop{
    public String name = "Omkar";

//    comment this and try
    public String toString(){
        return "Hello omkar";
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));
    }
}
