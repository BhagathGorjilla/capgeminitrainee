package Facebook;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class FacebookView {

	public static void main(String[] args) throws Exception{
		String s="y";
		while(s.equals("y")) {
			
			System.out.println("********MAIN MENU*********");
			System.out.println("press 1 for create profile");
			System.out.println("press 2 for view profile");
			System.out.println("press 3 for edit profile");
			System.out.println("press 4 for delete profile");
			System.out.println("press 5 for search profile");
			
			System.out.println("Enter your choice");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int c=Integer.parseInt(br.readLine());
			
			FacebookControl f= new FacebookControl();
			switch(c) {
			case 1:f.createProfile();
			       break;
			case 2:f.viewProfile();
		           break;
			case 3:f.editProfile();
		           break;
			case 4:f.deleteProfile();
		           break;
			case 5:f.searchrofile();
		           break;
		    default: System.out.println("Wrong Choice");   
			}
		
			System.out.println("do you want to continue press y/n");
			s=br.readLine();
	}

}
}