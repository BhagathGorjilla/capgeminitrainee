package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primenum {

public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter Number : ");
	int n=Integer.parseInt(br.readLine());
	for(int i=2;i<=n;i++)
	   {
		int c=0;
			for(int j=2;j<i;j++)
			{
			  if(i%j==0)
				  c++;
			}
			if(c==0)
				System.out.print(i+"  ");
			
		}
	}

}

