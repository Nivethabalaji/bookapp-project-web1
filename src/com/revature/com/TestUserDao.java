package com.revature.com;

public class TestUserDao {
	
	 public static void main(String[] args) throws Exception {
	 
	      //  UserClass user = new UserClass();
	      //user.setName("nivi");
	      //user.setEmail("nivi05");
	      // user.setPassword("ni345");
	 
	        UserDao userDAO = new UserDao();
	        String email="nivi05";
	        String password="ni345";
	        UserClass user= userDAO.login(email,password);
	        System.out.println(user);
	 
	    }
	 
	}

