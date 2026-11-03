package Exception;

public class Finally {
    public static void main(String[] args) {
        try{
            int result = 10/0;
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Hey i am execute in every situation");
        }
    }
}
