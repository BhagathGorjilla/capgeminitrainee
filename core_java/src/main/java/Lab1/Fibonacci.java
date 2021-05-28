package Lab1;
import java.io.*;

public class Fibonacci {
	static int a1=1;
	static int a2=1;
	static int a3=0;
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
     public int fib(int r) 
         {
		return r;
    
    	 }
    	 
    	
     
     
	public static void main(String[] args) throws Exception {
		//FIBONACCI WITHOUT RECURSION
		
		
		int n1=1;
		int n2=1;
		int n3=0;
		System.out.print("Enter Number of elements: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("WITHOUT RECURSION:");
		System.out.print(n1+"  "+n2);
		while(n-2>0) {
			n3=n1+n2;
			System.out.print("  "+n3);
			n1=n2;
			n2=n3;
			n--;
		}
		
		//FIBONACCI WITH RECURSION
		
		System.out.println();
		System.out.print("Enter Range: ");
		int r=Integer.parseInt(br.readLine());
		Fibonacci f=new Fibonacci();
		System.out.println("WITH RECURSION: ");
		System.out.print(a1+"  "+a2+"");
		while(a3<=r) {
			a3=a1+a2;
			if(a3<=r)
			 System.out.print("   "+f.fib(a3));
			a1=a2;
			a2=a3;
		}
	}
	
}