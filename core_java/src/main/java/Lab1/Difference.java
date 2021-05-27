package Lab1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Difference {
	static int s1=0;
	static int s2=0;
public static int calculateDiff(int a, int b) {
			return(a-b);
	}
public static void main(String[] args) throws Exception{
	System.out.print("Enter number: ");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	Difference m=new Difference();
		for(int i=0;i<=n;i++)
			{
				s1=s1+(i*i);
				s2=s2+i;
			}
				s2=s2*s2;
		System.out.println("Difference is :  "+m.calculateDiff(s1,s2));
		
		}

	}


