package basics;

interface Addition{
    int add(int a, int b);
}
public class FunctionalInterface {
    public static void main(String[] args) {

        Addition ad = (a,b) -> a+b;
        System.out.println(ad.add(5,6));
    }
}
