package Lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Elements : ");
		int n = sc.nextInt();
		System.out.println("Enter Numbers : ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		arr = modifyArray(arr);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

	public static int[] modifyArray(int[] arr) {
		int length = arr.length, counter = 0, j=0 ;
		Arrays.sort(arr);
		for(int i=0; i<length-1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
			else {
				counter+=1;
			}
		}
//		for(int i:arr) {
//		System.out.println(i);
//		}
		arr = Arrays.copyOfRange(arr, 0, length-counter);
		return arr;
	}
}