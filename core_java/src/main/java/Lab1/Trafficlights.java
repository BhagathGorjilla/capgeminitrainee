package Lab1;
import java.io.*;

public class Trafficlights {
	
	public void RedButton() {
		System.out.println("STOP");
	}
	public void GreenButton(){
		System.out.println("GO");
	}
	public void YelloButton() {
		System.out.println("Ready");
	}


	public static void main(String[] args)throws Exception{
		Trafficlights t = new Trafficlights();
		String s1 = "y";
		while(s1.equals("y")) {
		System.out.println("Press 1 for Red");
	    System.out.println("Press 2 for Green");
	    System.out.println("Press 3 for yello");
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Choice");
		String s = br.readLine();
		int i = Integer.parseInt(s);
		
		switch(i) {
		case 1 :  t.RedButton();
		break;
		case 2 :  t.GreenButton();
		break;
		case 3 :  t.YelloButton();
		break;
		default:System.out.println("Wrong Choice");
		}
		System.out.println("Do u want to Continue?");
		System.out.println("Press y/n");
		s1 = br.readLine();
		}
		
	}


}