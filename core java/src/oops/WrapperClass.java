package oops;

public class WrapperClass {
    public static void main(String[] args) {

//        autoboxing
        int x = 10;
        Integer y = x;  // or
//        Integer y = new Integer(x);  // but it is deprecated

        System.out.println(x);
        System.out.println(y);

//        auto - unboxing == wrapper to primitives

        Integer i = 10;
        int j = i.intValue() ;// i;

        System.out.println(i);
        System.out.println(j);
    }
}
