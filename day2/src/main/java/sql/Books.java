package sql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Books {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/capg","root","1998");
	 String str="y";
	 
	 
	while(str.equals("y")) {
	System.out.println();
	System.out.println("*******MAIN MENU*******");
	System.out.println("Enter the choice ");
	System.out.println("1-> to view all books ");
	System.out.println("2-> to add new book ");
	System.out.println("3-> to get books details by Id ");
	System.out.println("4-> to get books details by Author ");
	System.out.println("5-> to delete a book by ID ");
	System.out.println("6-> to update price of a book by ID ");
	int ch = Integer.parseInt(br.readLine());
		

	 switch(ch) {
	 
	 case 1:
		 PreparedStatement  pst0=con.prepareStatement("select * from books");
		 ResultSet rs0=pst0.executeQuery();
		 int count=0;
		 while(rs0.next()) {
			 System.out.println(rs0.getInt(1)+"  "+rs0.getString(2)+"  "+rs0.getString(3)+"  "+rs0.getDouble(4));
			 count++;
		 }
		 if(count==0)
			 System.out.println("OOps! EMPTY :( No books are present");	 
		 break;
	 case 2:
		 PreparedStatement pst1=con.prepareStatement("Insert into books(id,title,author,price)values(?,?,?,?);");
		 System.out.println("Enter Id : ");
		 int id=Integer.parseInt(br.readLine());
		 System.out.println("Enter Title : ");
		 String title=br.readLine();
		 System.out.println("Enter Author : ");
		 String author=br.readLine();
		 System.out.println("Enter price : ");
		 double price=Double.parseDouble(br.readLine());
		 pst1.setInt(1,id);
		 pst1.setString(2,title);
		 pst1.setString(3, author);
		 pst1.setDouble(4, price);
		 pst1.executeUpdate();
		 System.out.println("Book Added Successfully");
		 break;
		 
	 case 3:
		 PreparedStatement  pst2=con.prepareStatement("select * from books where id=?");
		 System.out.println("Enter Id : ");
	 	 int id2=Integer.parseInt(br.readLine());
	 	 pst2.setInt(1,id2);
	 	 ResultSet rs2=pst2.executeQuery();
	 	 int c=0;
	 	 while(rs2.next()) {
	 		 System.out.println(rs2.getInt(1)+"  "+rs2.getString(2)+"  "+rs2.getString(3)+"  "+rs2.getDouble(4));
	 		 c++;
	 	 }
	 	if(c==0)
			 System.out.println("No books are present with that ID");	
	 	 break;
	 	 
	 case 4:
		 PreparedStatement  pst3=con.prepareStatement("select * from books where author=?");
		 System.out.println("Enter Author : ");
	 	 String a3=br.readLine();
	 	 pst3.setString(1,a3);
	 	 ResultSet rs3=pst3.executeQuery();
	 	int count1=0;
	 	 while(rs3.next()) {
	 		 System.out.println(rs3.getInt(1)+"  "+rs3.getString(2)+"  "+rs3.getString(3)+"  "+rs3.getDouble(4));
	 		 count1++;
	 	 }
	 	 if(count1==0)
			 System.out.println("No books are present with that author");	 
	 	break;
	 	 
	 case 5:
		 PreparedStatement  pst4=con.prepareStatement("delete from books where id=?");
		 System.out.println("Enter Id : ");
		 int id4=Integer.parseInt(br.readLine());
	 	 pst4.setInt(1,id4);
	 	 int rs4=pst4.executeUpdate();
	 	 if(rs4==1)
	 		 System.out.println("BOOK DELETED && No of affected rows : "+rs4);
	 	 else
	 		System.out.println("No Book present with that ID");
	 	 break;
	 	 
	 case 6:
		 PreparedStatement pst5=con.prepareStatement("update books set price=? where id=?");
		 System.out.println("Enter Id : ");
		 int id6=Integer.parseInt(br.readLine());
		 System.out.println("Enter price : ");
		 double price6=Double.parseDouble(br.readLine());
		 pst5.setDouble(1,price6);
		 pst5.setInt(2, id6);
		 int rs5=pst5.executeUpdate();
		 if(rs5>0)
			 System.out.println("Price updated Successfully && No of affected rows : "+rs5); 
		 else
			 System.out.println("No Book present with that ID");
		 break;
		 
	default  :
		 System.out.println("INVALID CHOICE");
		 break;
	}
	 	System.out.println();
		System.out.println("press y to enter main menu");
		str=br.readLine();
	}

}
}
