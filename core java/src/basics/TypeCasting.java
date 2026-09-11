package basics;

public class TypeCasting {
    public static void main(String[] args) {
//        implicit
        int a = 256;
        byte b = 43;
        a = b;

        System.out.println(a);


//        explicit

        int c = 234;
        byte d = 23;
        d = (byte) c;
        System.out.println(d);

//        type promotions
        byte e = 10;
        byte f = 30;

        int result = (e * f);
        System.out.println(result);

    }
}
