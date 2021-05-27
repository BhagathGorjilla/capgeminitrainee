package Lab1;
import java.io.*;

public class Sum {
static int s=0;

 static int calculateSum(int n) {
			return(s);
	  }

public static void main(String[] args)throws Exception {
		System.out.print("Enter number: ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Sum e=new Sum();
		
		for(int i=0;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				s=s+i;
			}
		}
		System.out.print("SUM  is :  "+e.calculateSum(s));
		
	}

}
