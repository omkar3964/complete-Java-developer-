package basics;

public class IfElse {
    public static void main(String[] args) {
        int age = 98;

        if(age >=18 && age <=30)
            System.out.println("Your are younger person");
        else if(age < 18)
            System.out.println("You are not adult");
        else
            System.out.println("You are older");
    }
}
