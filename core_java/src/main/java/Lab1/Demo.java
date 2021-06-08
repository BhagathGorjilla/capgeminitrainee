package Lab1;

public class Demo {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3};
		arr2=arr1;
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+",");
		}
		}
	}

