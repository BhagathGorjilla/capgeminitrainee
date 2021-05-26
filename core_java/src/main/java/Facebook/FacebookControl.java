package Facebook;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FacebookControl {
	
	static String name;
	static String pass;
	static String email;
	static String address;
	
	
	public void createProfile()throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name ");
		 name=br.readLine();
		
		System.out.println("enter password ");
		 pass=br.readLine();
		
		System.out.println("enter email ");
		 email=br.readLine();
		
		System.out.println("enter address ");
		 address=br.readLine();
		 
		 System.out.println("profile created");
		 
		   System.out.println("your data is below");
			System.out.println("Name : "+name);
			System.out.println("password : "+pass);
			System.out.println("Email : "+email);
			System.out.println("Address : "+address);
			
		
		
	}
	public void viewProfile()throws Exception {
		
		System.out.println("****Profile Created with below Details  *****");
		System.out.println("Name : "+name);
		System.out.println("password : "+pass);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);	}


    

	public void editProfile() throws Exception {
		
		System.out.println("****YOUR PRESENT PROFILE****");
		System.out.println("Name : "+name);
		System.out.println("password : "+pass);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);	
		
		
		System.out.println("****YOUR PRESENT PROFILE****");
		System.out.println("Name : "+name);
		System.out.println("password : "+pass);
		System.out.println("Email : "+email);
		System.out.println("Address : "+address);	
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1 for name 2 for password 3 for mail 4 for adress  ");
        int ch=Integer.parseInt(br.readLine());
        
		switch(ch) {
		case 1: System.out.println("Enter Name ");
		        name=br.readLine();
		       break;
		case 2: System.out.println("Enter Password ");
                 pass=br.readLine();
	           break;
		case 3: System.out.println("Enter Email ");
                 email=br.readLine();
	           break;
		case 4: System.out.println("Enter Address ");
                 address=br.readLine();
	           break;
	    default: System.out.println("Invalid Choice");
               break;       
		}
	}

	public void deleteProfile() {

		name="";
		pass="";
		email="";
		address="";
		
		System.out.println("profile deleted");

		
	}

	public void searchProfile() throws Exception{
	    
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter Name ");
	    String input1=br.readLine();
	    
	    if(name.equals(input1)) {
	        System.out.println("Profile Found");
	    }
	    else {
	    	System.out.println("Profile Not Found");
		}
		
	}
	
	

	
		
}


