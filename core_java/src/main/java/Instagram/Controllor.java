package Instagram;
import java.io.*;

public class Controllor {
	
	static String name;
	static String password;
	static String email;
	static String address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void createProfile() throws Exception {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name ");
		 name=br.readLine();
		
		System.out.println("enter password ");
		 password=br.readLine();
		
		System.out.println("enter email ");
		 email=br.readLine();
		
		System.out.println("enter address ");
		 address=br.readLine();
		 System.out.println(name+"  "+password+" "+email+" "+ address);
	}

	public void viewProfile() throws Exception{
		System.out.println("****Profile Created with below Details  *****");
		System.out.println("Name : "+name);
		System.out.println("password : "+password);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);	}

	public void deleteProfile() {
		name="";
		password="";
		email="";
		address="";
		
		System.out.println("profile deleted");

	}

	
	

}
