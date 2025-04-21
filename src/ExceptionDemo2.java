import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 42;
        int c =0;


        Division d = new Division();
   try{
       c = d.divide(a,b);
   } catch(NullPointerException | IOException e){
       e.getMessage();
   } finally {

   }


        System.out.println("print result = "+c);
    }



}
