package com.revature.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	public  void register(UserClass user)throws Exception,Exception{
	 
	Connection con=ConnectionUtil.getConnection();
	String sql="insert into UserClass(name,email,password )values(?,?,?)";
	PreparedStatement pst= con.prepareStatement(sql);
	pst.setString(1,user.getName());
	pst.setString(2,user.getEmail());
	pst.setString(3,user.getPassword());
	int rows=pst.executeUpdate();
			
		System.out.println(rows);
	}
	public UserClass  login(String email, String password) throws Exception {
	//public static void main(String[] args) throws Exception {
		
	
		 Connection con=ConnectionUtil.getConnection();
		 String sql = "select id,name,email,password from UserClass where email = ? and password = ? ";
		 PreparedStatement pst=con.prepareStatement(sql);
		 pst.setString(1,email);
		 pst.setString(2,password);
		 UserClass user = null;
		 ResultSet rs=pst.executeQuery();
		 if(rs.next()){
			 int id=rs.getInt("id");
			 String name=rs.getString("name");
			 String Email=rs.getString("email");
			 String Password=rs.getString("password");
			 
			 
			 user=new UserClass();
			 user.setId(id);
			 user.setName(name);
			 user.setEmail(Email);
			 user.setPassword(password);
			 
			 
		 }
		 
	        System.out.println(user);
	        return user;
	 
	
}
}
