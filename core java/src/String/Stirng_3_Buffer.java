package String;
import java.lang.StringBuffer;


public class Stirng_3_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("omkar");

        System.out.println(sb);

        sb.append(" malbhare");
        System.out.println(sb);

        sb.insert(2, "R");
        System.out.println(sb);

        sb.delete(2, 6);
        System.out.println(sb);
    }
}


