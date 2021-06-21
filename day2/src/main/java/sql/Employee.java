package sql;

import java.sql.*;


public class Employee {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {


		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/capg","root","1998");
		Statement st=con.createStatement();
		
		
		int insertedrows= st.executeUpdate("insert into emp values(6,'Ram',15000)");
		int deletedrows= st.executeUpdate("delete from emp where eid=6");
		int updatedrows= st.executeUpdate("update emp set esalary=12000 where eid=1");
		
		System.out.println("No of Inserted Rows: "+insertedrows);		
			System.out.println("No of Deleted Rows : "+deletedrows);
		System.out.println("No of Updated Rows : "+updatedrows);
		
		
	
		
		/*
		 * ResultSet rs=st.executeQuery("Select * from emp");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "
					+ ""+rs.getDouble(3));
		}
		con.close(); */
	}

}

