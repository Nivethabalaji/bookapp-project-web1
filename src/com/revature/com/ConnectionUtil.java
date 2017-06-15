package com.revature.com;
    
    import java.sql.Connection;
    import java.sql.DriverManager;
    public class ConnectionUtil {

	    public static void main(String[] args) throws Exception {
		Connection con =getConnection();
        System.out.println(con);
      }
	

	 
	    public static Connection getConnection()throws Exception{
	 
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book5", "root", "root");
	        System.out.println(con);
			return con;
	    }
	
	 
	    }


	
		
	 
	


