package basics;

enum Laptop{
    mackbook(2000), dell(2500), hp_pavilian, thinkpad(5000);


    private float price;
    Laptop(){
        this.price=1245;
    }
    Laptop(float price){
        this.price=price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
public class Enum2 {
    public static void main(String[] args) {
        Laptop l1 = Laptop.dell;
        System.out.println(l1);
//        System.out.println(l1.price); we cant access because its private and we nedd public getter / setter
        System.out.println(l1.getPrice());
    }
}
