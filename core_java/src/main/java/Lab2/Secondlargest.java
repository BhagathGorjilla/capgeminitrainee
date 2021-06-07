package Lab2;
import java.util.*;
import java.io.*;

public class Secondlargest  {
	
	
	public static int secondSmallest(int [] arr) {
		Arrays.sort(arr);
		return arr[1];
		
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Length of Array");
		int n=Integer.parseInt(br.readLine());
		
		int [] arr=new int [n];
		System.out.println("Enter Elements in Array");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		
		}
		
		Arrays.sort(arr);
	    System.out.println("Second Smallest is : "+arr[1]);	
	    System.out.println(secondSmallest(arr));	
		
	}

}
