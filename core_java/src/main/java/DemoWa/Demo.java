package DemoWa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo {

		public static void main(String[] args) throws Exception {
			String ss = "y";
			
			while (ss.equals("y")) {
				System.out.println("********MAIN MENU*******");
				System.out.println("press 1 to create profile");
				System.out.println("press 2 to view profile");
				System.out.println("press 3 to edit profile");
				System.out.println("press 4 to login profile");
				System.out.println("press 5 to delete profile");
				System.out.println("Press 6 to search for profile");
				System.out.println("Press 7 to reset the account");
				
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter your choice");
				int ch =Integer.parseInt(br.readLine());
				
				WhatsappControl w=new WhatsappControl();

				switch (ch) {
				case 1:
					w.createProfile();
					break;
				case 2:
					w.viewProfile();
					break;
				case 5:
					w.deleteProfile();
					break;
				case 3:
					w.editProfile();
					break;
				case 4:
					w.loginProfile();
					break;
				case 6:
					w.searchProfile();
					break;
				case 7:
					w.resetProfile();
					break;	
				default:
					System.out.println("invalid case");
					break;

				}
				System.out.println("do you want to continue press y/n");
				ss = br.readLine();
			}
		}
}
		
		class WhatsappControl {
			static String name;
			static String pass;
			static String email;
			static String address;
			static String security;
			
			
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
				 

			    System.out.println("***security Question***");
			    System.out.println("enter your pet name");
			      security=br.readLine();
				 System.out.println("*****Thank YOU   "+name+"   *****");
				
				 
				   System.out.println("****Profile Created with below Details  *****");
					System.out.println("Name : "+name);
					System.out.println("password : "+pass);
					System.out.println("Email : "+email);
					System.out.println("Address : "+address);
					System.out.println("security answer : "+security);

					
				
				
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
				security="";
				
				System.out.println("profile deleted");
			}
			
			public void editProfile() throws Exception {
				System.out.println("****YOUR PRESENT PROFILE****");
				System.out.println("Name : "+name);
				System.out.println("password : "+pass);
				System.out.println("Email : "+email);
				System.out.println("Address : "+address);	
				System.out.println("security answer : "+security);
				
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter 1 for name 2 for password 3 for mail 4 for adress 5 for security que  ");
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
				case 5:  System.out.println("SECURITY QUESTION  : enter your pet name");
						System.out.println("Enter Security answer ");
		               security=br.readLine();
		      break;
			    default: System.out.println("Invalid Choice");
		               break;       
				}
			}
			
			
			public void loginProfile() throws Exception {
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int i=3;
		           while(i!=0) {
				   System.out.println("Enter Name ");
		           String input1=br.readLine();
		           System.out.println("Enter Password");
		           String input2=br.readLine();
		           
		            if((input1.equals(name)) &&(input2.equals(pass))) {
		            	System.out.println("Logged in Successfully");
		            	break;
		            }
		            else {
		            	i=i-1;
		            	System.out.println("Invalid Username Or Password");
		            	System.out.println("Attempts Remaining:"+i);
		            }
		            
		          
		           }
		           if(i==0) {
		           	System.out.println("Attempts Excluded");
		           }
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
			public void resetProfile() throws Exception {
			     
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			    System.out.println("***security question ");
			    System.out.println("enter your pet name");
			    String input1=br.readLine();
			    if(security.equals(input1)) {
			        System.out.println("Account Reset Successful");
			        System.out.println("Enter New Password");
			        pass =br.readLine();
			        System.out.println("New Password is : "+pass);
			        
			    }
			    else {
			    	System.out.println("Invalid Answer");
				}


				
			}
		}

	


















