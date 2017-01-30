package com.test;

import com.dao.BookDaoImpl;
import com.model.Book;

public class TestBookDaoImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookDaoImpl bookdao=new BookDaoImpl();
		
		Book book = new Book();
		
		book.setAuthorname("XXX");
		
		book.setBookname("SQL");
		
		bookdao.updateBook(book);
		
		//bookdao.deleteBook("Unrest");

	}

}
