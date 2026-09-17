package String;

public class String_1 {
    public static void main(String[] args) {
        String s1 = "omkar";
        String s2 = "omkar";
        String s3 = new String("omkar");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println(s1.concat(" malbhare"));
        System.out.println(s1);
    }
}
