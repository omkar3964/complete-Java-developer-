package oops;

class Calculator1{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}

public class Compile {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        System.out.println(c1.add(1,2));
        System.out.println(c1.add(1,2,3));
        System.out.println(c1.add(1.3,3.5));

    }
}
