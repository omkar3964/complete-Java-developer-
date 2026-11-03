package Exception;

import javax.crypto.spec.PSource;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

    static void readFile() throws FileNotFoundException {
        FileReader file = new FileReader(".Data.txt");
        System.out.println("File open Successfully");
    }
    public static void main(String[] args) {
        try {
            readFile();
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }

        System.out.println("finish program");

    }
}
