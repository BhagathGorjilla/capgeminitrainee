package Lab5;
//import Lab5.InvalidNameException;
public class Ex2 {
	private static String Firstname;
	private static String Lastname;
	
	public Ex2(String Firstname, String Lastname) {
		super();
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		System.out.print(Firstname+ Lastname);
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
	public static void main(String[] args) {
		Ex2 e=new Ex2("BG","HS");
		
		
		if(Firstname.contentEquals(" ") || Lastname.equals(" "))
		{
			throw new InvalidNameException();
		}
	System.out.println("\nFIRST NAME = "+Firstname
			           +"\nLAST NAME = "+Lastname);	
}
}
