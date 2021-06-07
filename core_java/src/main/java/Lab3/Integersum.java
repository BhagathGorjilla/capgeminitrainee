package Lab3;
import java.util.*;
import java.io.*;

public class Integersum {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Integer String : ");
		String s=br.readLine();
		int sum=0;
		
		StringTokenizer sb=new StringTokenizer(s);
		while(sb.hasMoreTokens()) {
			int n=Integer.parseInt(sb.nextToken());
			System.out.println("Number is : "+n);
			sum=sum+n;
		}
		
		System.out.println("Sum is : "+sum);
	}

}
