package Lab2;
import java.util.*;
import java.io.*;

public class Upperlower {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Elements : ");
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();  //skipping 1st input for sc.nextLine()
		}
		//System.out.println(sortStrings(str));
//		String[] str1 = sortStrings(str1);
//		for(int i=0; i<str1.length; i++) {
//			System.out.println(str1[i]);
		
		str = sortStrings(str);
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");		
		}
	}

	public static String[] sortStrings(String[] str) {
		int n = str.length;
		String[] newStr =new String[n]; 
		Arrays.sort(str);
		if (n % 2 == 0) {
			for (int i = 0; i < (n / 2); i++) {
				System.out.println(str[i].toUpperCase());
				newStr[i] = str[i].toUpperCase();
				
			}
			for (int i = (n / 2); i < n; i++) {
				System.out.println(str[i].toLowerCase());
				newStr[i] = str[i].toLowerCase();
			}
		} else {
			for (int i = 0; i < (n / 2) + 1; i++) {
				System.out.println(str[i].toUpperCase());
				newStr[i] = str[i].toUpperCase();
				
			}
			for (int i = (n / 2) + 1; i < n; i++) {
				System.out.println(str[i].toLowerCase());
				newStr[i] = str[i].toLowerCase();
				
			}

		}
		return newStr;
	}
}