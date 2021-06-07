package Lab2;
import java.util.*;

public class Sorting {


	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no. of input : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr = getSorted(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		sc.close();
		
	}
	
	public static int[] getSorted(int[] arr) {
		
		int n = arr.length;
		int[] newArr = new int[n];
		for(int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(arr[i]);
			sb.reverse();
			int num = Integer.parseInt(sb.toString());
			newArr[i] = num;
			
		}
		Arrays.sort(newArr);
		return newArr;
		//for(int i=0; i<n; i++)
		//System.out.println(newArr[i]);
		
		
	}
	
}