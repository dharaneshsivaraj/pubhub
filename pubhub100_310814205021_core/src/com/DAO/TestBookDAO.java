package com.DAO;

import com.model.Book;

public class TestBookDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setName("book1");
		book.setPrice(20);
		BookDAO bookdao=new BookDAO(); 
	    bookdao.add(book);
		System.out.println(book);
		
		
		
		

		
	}

}
