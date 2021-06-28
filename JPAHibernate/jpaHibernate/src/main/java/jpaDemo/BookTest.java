package jpaDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookTest {

	public static void main(String[] args) throws IOException, BookNotFoundException {
		
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = fact.createEntityManager();
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str="y";
		
		while(str.equals("y")) {
			
		em.getTransaction().begin();
		
		System.out.println("=====Menu====");
		System.out.println("1--->Insert a book");
		System.out.println("2--->Find a book");
		System.out.println("3--->Update a book");
		System.out.println("4--->Delete a book");
		System.out.println("Enter Choice");
		int ch=Integer.parseInt(br.readLine());
		
		
		
		switch(ch) {
		
		
		case 1:
			System.out.println("Enter Name of Book");
			String name=br.readLine();
			System.out.println("Enter price of Book");
			double price=Double.parseDouble(br.readLine());
			Book s1 = new Book(name,price);
			em.persist(s1);
			System.out.println(s1);
			System.out.println("Book insertion successsful");
			break;
        
		case 2:
			try {
			System.out.println("Enter ID of Book to find a book");
			int id=Integer.parseInt(br.readLine());
			Book s2=em.find(Book.class, id);
			System.out.println(s2);
				if(s2==null){ 
					throw new BookNotFoundException("Book Not Found"); 
					}
				}
			catch (BookNotFoundException e){
				e.printStackTrace();
				e.getMessage();
				
			}
			
			break;
		 
		case 3:
			System.out.println("Enter ID of Book to update a book");
			int id1=Integer.parseInt(br.readLine());
			Book s3=em.find(Book.class, id1);
			System.out.println("Before Updating");
			System.out.println(s3);
		    if (s3==null) {
		    	throw new BookNotFoundException("Book Not Found");
		    }
			System.out.println("=====Menu====");
			System.out.println("1--->Update name of the book");
			System.out.println("2--->Update price of the book");
			System.out.println("2--->Update both name and price of the book");
			int ch1=Integer.parseInt(br.readLine());
			switch(ch1) {
				case 1:
					System.out.println(s3);
					System.out.println("Enter new name of book");
					String newname=br.readLine();
					s3.setName(newname);	
					em.merge(s3);
					System.out.println("Book name changed successsfully");
					break;
				case 2:
					System.out.println(s3);
					System.out.println("Enter new price of book");
					double price1=Double.parseDouble(br.readLine());
					s3.setPrice(price1);
					em.merge(s3);
					System.out.println("Book price updated successsfully");
					break;
				case 3:
					
					System.out.println("Enter new name of book");
					String newname1=br.readLine();
					s3.setName(newname1);
					System.out.println("Enter new price of book");
					double price2=Double.parseDouble(br.readLine());
					s3.setPrice(price2);
					em.merge(s3);
					System.out.println("updated successsfully");
					break;
					}
		
		System.out.println("After Updating");
		System.out.println(em.find(Book.class,id1));
		break;
		
		case 4:
			System.out.println("Enter ID of Book to delete a book");
			int id2=Integer.parseInt(br.readLine());       
			Book s4=em.find(Book.class,id2);		
			em.remove(s4);
			System.out.println("Book removed");
			break;  
			
		 
		default:System.out.println("Invalid Choice");
	
		}
		
		em.getTransaction().commit();
	    
	    
		System.out.println("Enter y for main menu or n for exit");
		str=br.readLine();
		
		
		
		
	}
		em.close();		
				
}
	
}	