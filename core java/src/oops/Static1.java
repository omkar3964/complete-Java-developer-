package oops;

class Mobile{
    String name;
    static String brand;
    double price;

    void show(){
        System.out.println(brand);
        System.out.println(name);
        System.out.println(price);
    }
}

public class Static1 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.name = "phone";
        m1.price=2345;
        m1.brand = "apple";
        m1.show();

        Mobile m2 = new Mobile();
        m2.name = "mobile";
        m2.price=23425;
        m2.brand = "motrola";
        m2.show();

    }
}
