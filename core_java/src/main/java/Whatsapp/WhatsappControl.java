package Whatsapp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class WhatsappControl {

	private String name;
	private String pass;
	private String email;
	private String address;
	
	
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
		 System.out.println("*****Thank YOU   "+name+"   *****");
		
		 
		   System.out.println("****Profile Created with below Details  *****");
			System.out.println("Name : "+name);
			System.out.println("password : "+pass);
			System.out.println("Email : "+email);
			System.out.println("Address : "+address);
			
		
		
	}
	public void viewProfile()throws Exception {
		
		 System.out.println("*** "+name+ " Your Profile Details   ****");
			System.out.println("Name : "+name);
			System.out.println("password : "+pass);
			System.out.println("Email : "+email);
			System.out.println("Address : "+address);
	}
	public void deleteProfile()throws Exception {
		
		name="";
		pass="";
		email="";
		address="";
		
		System.out.println("profile deleted");
	}
	
	public void editProfile() throws Exception {
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
	
	
	public void loginProfile() throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter Name ");
           String input1=br.readLine();
           System.out.println("Enter Password");
           String input2=br.readLine();
           int i=3;
           	if(i>0) {
            if((input1.equals(name)) &&(input2.equals(pass))) {
            	System.out.println("Logged in Successfully");
            }
            else {
            	i--;
            	System.out.println("Invalid Username Or Password");
            	System.out.println("Attempts Remaining:"+i);
            }
            
           	}	
           	else
           		System.out.println("Attempts Excluded");
           }
	public void searchProfile() throws Exception {
		
       
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