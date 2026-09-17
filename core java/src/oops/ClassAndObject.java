package oops;

class Calculator{
    int num = 5;

    public int add(int n1, int n2){
        return n1+n2;
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        int data = 10;

        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        System.out.println(obj1.add(20,30 ));
        obj2.num = 20;
        System.out.println(obj1.num);
        System.out.println(obj2.num);


    }
}
