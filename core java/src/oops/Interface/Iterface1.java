package oops.Interface;
interface Devloper{
    String name = "Developer";
    void show();

    default void def(){
        System.out.println("This is default method");
    }
    private void pri(){
        System.out.println("This is Private method");
    }
    static void stat(){
        System.out.println("This is Static method");
    }
}
interface Laptop{
    void lap();
}
class A implements Devloper,Laptop{

    @Override
    public void show() {
        System.out.println("This is show from interface Developer");
    }

    @Override
    public void def() {
        System.out.println("This is def method from Developer Interface");
    }

    @Override
    public void lap() {
        System.out.println("This is laptop");
    }
}
public class Iterface1 {
    public static void main(String[] args) {
        Devloper d = new A();
        d.def();
        d.show();

        Laptop d2 = new A();
        d2.lap();


    }
}
