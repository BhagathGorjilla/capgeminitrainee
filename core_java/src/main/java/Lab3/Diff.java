package Lab3;
import java.util.Scanner;


public class Diff {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		 
		    String str = String.valueOf(number);
		    char ch = 0;
		    int length=str.length();

		    for (int i = 0; i < str.length() - 1; i++) {
		        ch = str.charAt(i);  
		        int di = Character.getNumericValue(ch);
		        char ch2 = str.charAt(i + 1);
		        int di2 = Character.getNumericValue(ch2);
		        int diff = Math.abs(di - di2);
		        System.out.print(diff);
		        
		    } 
		    System.out.print(str.charAt(length-1));

	}

}