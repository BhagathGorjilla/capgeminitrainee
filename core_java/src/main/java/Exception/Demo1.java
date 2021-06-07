package Exception;

public class Demo1 {


    public static void main(String[] args) throws Exception  {
          Demo1 demo = new Demo1();
          demo.m1();
         
    
    }
    
    public void m1() throws Exception{
        System.out.println("m1");
        m2();
    }

 

    public void m2() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("m2");
        m3();
    }
    public void m3()throws Exception {
    System.out.println("m3");
      throw new Exception();
    }
    
    
    
    

 

}
 