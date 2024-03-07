package exceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class MyThrowsException {

	public static void method1() throws SQLException,IOException, NullPointerException{
	
		System.out.println("In method 1");
		method2();
		throw new IOException("Error");
		//System.out.println("End of Method1");
	}
	
	public static void method2() throws SQLException
	{
		System.out.println("In method 2");
		throw new SQLException("Error");
	}
	public static void main(String[] args) throws NullPointerException, SQLException, IOException {
		try {
		method1();
	}catch(SQLException e) {
		System.out.println("In catch 1");
	}catch(NullPointerException e) {
		System.out.println("In catch 2");
	}catch(IOException e) {
		System.out.println("In catch 3");
		
	}
		
		System.out.println("End of Main Method");

	}

}
