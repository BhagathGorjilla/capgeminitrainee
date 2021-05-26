package Whatsapp;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class WhatsappView { // if class will not be public then we can not use this class in other packages
	

	public static void main(String[] args) throws Exception {
		String ss = "y";
		//if we have to use object in one method then create as below otherwise if want to use in many methods then create object using constructor.
		WhatsappControl w=new WhatsappControl();
		//    object  = create memory + initialize that memory

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
















