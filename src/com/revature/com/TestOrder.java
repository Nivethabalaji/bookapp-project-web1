package com.revature.com;

import java.time.LocalDate;
import java.util.List;

public class TestOrder {

	public static void main(String[] args) throws Exception {
		LocalDate p=LocalDate.parse("2014-05-10");
		BookOrder order =new BookOrder();
		order.setUserClassId(1);
		order.setBookId(2);
		order.setStatus("ordered");
		order.setQuantity(1);
		order.setOrderDate(p);
		
		 BookorderDAo bookorderDAO = new BookorderDAo();
		 
		 List<BookOrder>bookList=bookorderDAO.login();
		 for(BookOrder b:bookList){
			 
		 
		 
	        
	        System.out.println(b);
	 

	}

}
}
