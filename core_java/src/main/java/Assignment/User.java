package Assignment;

public class User {

	public static void main(String[] args) {
		Animals [] arr= new Animals [3];
		arr[0]= new Cat();
		arr[1]= new Dog();
		arr[2]= new Lion();
		
		for(Animals a:arr) 
		{
			 a.talk();
             a.respirate();
           System.out.println();
		}
		
	}

}
