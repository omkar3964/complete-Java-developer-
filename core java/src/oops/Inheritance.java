package oops;

class Cal{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvanceCal extends Cal{
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}
class VeryAdvanceCal extends AdvanceCal{

    public double pow(int a, int b){
        return Math.pow(a,b);
    }

}

public class Inheritance {
    public static void main(String[] args) {


        VeryAdvanceCal c1 = new VeryAdvanceCal();
        System.out.println(c1.add(2,4));
        System.out.println(c1.sub(2,4));
        System.out.println(c1.mul(2,4));
        System.out.println(c1.div(2,4));
        System.out.println(c1.pow(2,4));

    }
}
