package oops;

class MobilePhone {
    String name;
    static String brand;
    double price;

    static {
        brand = "Samsung";
    }

    MobilePhone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void show() {
        System.out.println(brand);
        System.out.println(name);
        System.out.println(price);
    }
}

public class Static2 {
    public static void main(String[] args) {
        MobilePhone mp1 = new MobilePhone("galaxy 14", 23432);
        mp1.show();

        System.out.println(MobilePhone.brand);
    }
}
