import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsHandling{
    static void method1() {
        try{
            FileNotFoundExceptionDEMO.calculateTotal();
        }
        catch(FileNotFoundException e){
            throw new RuntimeException(e);        
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            int s =sc.nextInt();
        } catch (Exception e) {
            System.out.println("Catch");
        }
        finally{
            sc.close();
        }
        System.out.println("Mathod1");
    }
}