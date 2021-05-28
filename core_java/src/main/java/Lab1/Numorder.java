package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Numorder {
	
	
	public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int temp = n%10;
	while(n>0) {
		int r=n%10;
		n=n/10;
		if(temp>=r)
	     temp=r;
		else
			break;
		
		
	}
	
	}
	
	

}
