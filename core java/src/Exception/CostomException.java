package Exception;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class CostomException {
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException( "Age must be 18 or above"      );
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(2);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
