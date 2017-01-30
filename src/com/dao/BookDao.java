package com.dao;

import java.util.List;

import com.model.Book;

public interface BookDao {
	
	public void addBook(Book book);
    public List<Book> getAllBooks();
    public int updateBook(Book book);
    public void deleteBook(String bookname);
    

}
