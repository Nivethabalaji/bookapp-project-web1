package com.revature.com;

import java.time.LocalDate;

public class BookOrder {
	private Integer id;
	private Integer userClassId;
	private Integer bookId;
	private String status;
	private Integer quantity;
	private LocalDate orderDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserClassId() {
		return userClassId;
	}
	public void setUserClassId(Integer userClassId) {
		this.userClassId = userClassId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "BookOrder [id=" + id + ", userClassId=" + userClassId + ", bookId=" + bookId + ", status=" + status
				+ ", quantity=" + quantity + ", orderDate=" + orderDate + "]";
	}
	

}
