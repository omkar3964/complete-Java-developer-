package Exception;

public class ExceptionExample {
    public static void main(String[] args) {


        int i = 10;
        int j = 10;
        int[] arr= new int[3];

        try {
            int result = i / j;
            System.out.println(arr[9]);
        }catch (ArithmeticException e){
            System.out.println("Cant devide by zero" + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
