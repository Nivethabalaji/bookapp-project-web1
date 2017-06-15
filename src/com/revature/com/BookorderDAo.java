package com.revature.com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookorderDAo {
	public void register (BookOrder order)throws Exception{
		 LocalDate p=LocalDate.parse("2014-05-10");
		 
		Connection con=ConnectionUtil.getConnection();
		String sql="insert into Bookorders(UserClass_id,book_id,status,quantity,Order_date)values(?,?,?,?,?)";
		PreparedStatement pst= con.prepareStatement(sql);
		pst.setInt(1,order.getUserClassId());
		pst.setInt(2,order.getBookId());
		pst.setString(3,order.getStatus());
		pst.setInt(4,order.getQuantity());
		pst.setDate(5,Date.valueOf(p));
		
		int rows=pst.executeUpdate();
		System.out.println(rows);
	

}
	//public static void main(String[] args)throws Exception {
		
	
	public List<BookOrder> login() throws Exception {
		Connection con=ConnectionUtil.getConnection();
		String sql="select id,UserClass_id,book_id,status,quantity,Order_date from Bookorders ";
		PreparedStatement pst=con.prepareStatement(sql);
		List<BookOrder>orderList=new ArrayList<BookOrder>();
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			int Id=rs.getInt("id");
			int userclassId=rs.getInt("userClass_id");
			int bookId=rs.getInt("book_id");
			String status=rs.getString("status");
			int quantity =rs.getInt("quantity");
			Date order_date=rs.getDate("order_date");
			BookOrder order=new BookOrder();
			order.setId(Id);
			order.setBookId(bookId);
			order.setUserClassId(userclassId);
			order.setQuantity(quantity);
			order.setStatus(status);
			order.setOrderDate(order_date.toLocalDate());
			
			
			
			
			
			
			
		}
		System.out.println(orderList);
		
		return orderList;
		
	
		
		
		
		
	}
	}




