package sql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Employeeprops {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	FileInputStream fis = new FileInputStream("jdbc.prop");
	Properties props = new Properties();
	props.load(fis);
	String driver = (String) props.get("driver");
	String url    = (String) props.get("url");
	String uid    = (String) props.get("uid"); 	
	String pwd    = (String) props.get("pwd");
	
	/*
	driver=com.mysql.jdbc.Driver
	url=jdbc:mysql://localhost:3306/capg
	uid=root
	pwd=1998
	*/
	
	Class.forName(driver);
	Connection con= DriverManager.getConnection(url,uid,pwd);
	Statement st=con.createStatement();
	int insertedRows = st.executeUpdate("insert into emp values(6,'name6',4000)");
	int deletedRows = st.executeUpdate("delete from emp where ename ='Name'");
	System.out.println("no of rows inserted:"+insertedRows);
	System.out.println("no.of rows deleted:"+deletedRows);
	
	// ResultSet rs =st.executeQuery("select * from emp");
	// ResultSetMetaData rsm = rs.getMetaData();
	// String colType = rsm.getColumnClassName(1);
	// System.out.println("Datatype of firstColumn"+colType);
	/* while(rs.next()) {
	System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
	}*/
	con.close();
	
	}

}
