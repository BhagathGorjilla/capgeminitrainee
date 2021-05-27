package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Numorder {
	public static void main(String[] args) throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int num=Integer.parseInt(br.readLine());
	int back=num%10;
	int back2;
	while(num!=0) {
		back2=num%10;
		
		num=num/10;
		
	}
	
	}
	
	

}
