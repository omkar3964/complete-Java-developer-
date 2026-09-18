package oops;

class A extends Object{
    public String name = "omkar";
    public A(){
        super();
        System.out.println("In A default constructor");
    }
    public A(int n){
        super();
        System.out.println("In A Parameterized constructor");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B default constructor");
    }
    public B(int n){
        super();
        System.out.println(super.name);
        System.out.println("In B Parameterized constructor");
    }
}

public class Super {
    public static void main(String[] args) {
//        B b = new B();
        B b = new B(3);
    }
}
