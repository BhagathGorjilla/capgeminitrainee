package Lab5;

public class InvalidNameException  extends RuntimeException{

	public String toString() {
		return "Lab5.Invalid name:Firstname and Lastname not Entered properly";
	}
}
