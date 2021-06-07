package Exception;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class Demo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
                
        try{
         System.out.println(10/0);
         System.out.println("some more code in try");
       }
       catch(ArithmeticException e1){
          System.out.println( e1.getClass());
          System.out.println("We can not divide by zero");
       } 
       
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array index does not exist");
       }
        catch (Exception e){
                System.out.println("some exception ,,, may be number-format");
         }
        finally{
            System.out.println("ClEAN UP CODE...Finally gets executed in both cases");
        }
       
       
       System.out.println("some code after exception");
    }

 

}
 