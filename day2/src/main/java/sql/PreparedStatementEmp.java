package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/capg","root","1998");
		

		PreparedStatement ps=con.prepareStatement("Select * from emp where eid=?");
		System.out.print("Enter Id ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getDouble(3));
		}
		
		PreparedStatement pst=con.prepareStatement("delete from emp where eid=?");
		System.out.print("Enter Id you want to delete : ");
		int id1=sc.nextInt();
		pst.setInt(1,id1);
		int delete=pst.executeUpdate();
		System.out.println("Deleted ROWS ="+delete);
		
		
		PreparedStatement pst2=con.prepareStatement("update emp set esalary=? where eid=?  ");
		System.out.println("Enter Id you want to update salary ID : ");
		int id2=sc.nextInt();
		System.out.println("Enter updated salary : ");
		double salary=sc.nextDouble();
		pst2.setDouble(1,salary);
		pst2.setInt(2,id2);
		int update=pst2.executeUpdate();
		if(update==1)
			System.out.println("Salary Updated Succeesfully");
		else
			System.out.println("Unsuccessful");
	}

}
