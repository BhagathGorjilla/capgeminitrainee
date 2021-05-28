package Lab3;
import java.io.*;
import java.util.*;
public class Mirrorstring {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a String: ");
		String s=br.readLine();
		
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(s+" | "+sb);
	}

}
