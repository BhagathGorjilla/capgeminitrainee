package Lab1;
import java.io.*;

public class Twopower {
	public boolean power(int n) {
		while(n%2==0) {
			n=n/2;
		}
		if(n==1)
			return true;
		else
			return false;
	}

	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number:  ");
		Twopower m= new Twopower();
		int n=Integer.parseInt(br.readLine());
		System.out.println(m.power(n));
	}

}