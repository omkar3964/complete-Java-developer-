package String;
import java.lang.StringBuilder;
public class Sting_2_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("omkar");

        System.out.println(sb);

        sb.append(" malbhare");
        System.out.println(sb);

        sb.insert(2, "R");
        System.out.println(sb);

        sb.delete(2, 6);
        System.out.println(sb);
    }
}
