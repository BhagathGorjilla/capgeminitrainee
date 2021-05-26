package Instagram;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import Instagram.Controllor;

public class View {

	public static void main(String[] args) throws Exception {
		String s="y";
		while(s.equals("y"))
		{
		System.out.println("****************************MAIN MENU*********************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to login profile");
		System.out.println("press 5 to edit profile");
        
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Choice");
		int c = Integer.parseInt(br.readLine());
		
		Controllor cr=new Controllor();
		switch (c) {
		case 1: cr.createProfile();
		        break;
		        
		case 2: cr.viewProfile();
				break;
				
		case 3: cr.deleteProfile();
				break;
				
		default : System.out.println("Invalid Choice");
		
		}
		System.out.println("do you want to continue press y/n");
		s = br.readLine();
	}
	}
}
