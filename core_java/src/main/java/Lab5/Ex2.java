package Lab5;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex2 {
	private static String Firstname;
	private static String Lastname;
	
	public Ex2(String Firstname, String Lastname) {
		super();
		this.Firstname=Firstname;
		this.Lastname=Lastname;
	}
	
	public static String getFirstname() {
		return Firstname;
	}
	public static void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public static String getLastname() {
		return Lastname;
	}
	public static void setLastname(String lastname) {
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Name : ");
		String FN=br.readLine();
		System.out.println("Enter Last Name : ");
		String LN=br.readLine();
		
		
		Ex2 e=new Ex2(FN,LN);
		
		
		if(Firstname.contentEquals("") || Lastname.equals(""))
		{
			throw new InvalidNameException();
		}
	System.out.println("\nFIRST NAME = "+Firstname
			           +"\nLAST NAME = "+Lastname);	
}
}
