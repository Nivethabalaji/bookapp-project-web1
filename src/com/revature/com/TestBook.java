package com.revature.com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestBook {

	public static void main(String[] args) throws Exception {
		LocalDate p=LocalDate.parse("2014-05-10");
		
		 BookDao bookDAO = new BookDao();
		 List<Book>bookList=bookDAO.login();
		 for(Book b:bookList){
			 
		 
		 
	        
	        System.out.println(b);
	 

	}

	}
}
