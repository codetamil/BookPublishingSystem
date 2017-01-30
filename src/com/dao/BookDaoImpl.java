package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.connectionUtil.ConnectionUtil;
import com.model.Book;

public class BookDaoImpl implements BookDao {
	
	Connection connection=ConnectionUtil.getConnection();
	
	PreparedStatement preparedStatement=null;

	@Override
	public void addBook(Book book)  {
		// TODO Auto-generated method stub
		String query="insert into book values(?,?,?)";
		//PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, book.getAuthorname());
			preparedStatement.setString(2, book.getBookname());
			preparedStatement.setString(3, book.getTopics());
	        preparedStatement.executeUpdate();
	        preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		List<Book> books = new LinkedList<Book>();
        try {
        	String query="select authorname,bookname,topic from book";
               Statement statement = connection.createStatement();
               ResultSet resultSet = statement.executeQuery(query);
                
               Book book = null;
               while(resultSet.next()){
                  book = new Book();
                   book.setAuthorname(resultSet.getString("authorname"));
                   book.setBookname(resultSet.getString("bookname"));
                   book.setTopics(resultSet.getString("topic"));
                    
                   books.add(book);
               }
               resultSet.close();
               statement.close();
                
           } catch (SQLException e) {
               e.printStackTrace();
           }
           System.out.println(books);
           return books;
	}

	@Override
	public int updateBook(Book book) {
		// TODO Auto-generated method stub
		
		String query="update book set authorname=? where bookname=?";
		
		
		
		int rows=0;
		
		try {
			preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1, book.getAuthorname());
			preparedStatement.setString(2, book.getBookname());
			
			 rows=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Book updated");
		return rows;
	}

	@Override
	public void deleteBook(String bookname) {
		// TODO Auto-generated method stub
		String query="delete from book where bookname=?";
		
		try {
			preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setString(1, bookname);
			
			preparedStatement.executeUpdate();
			
			System.out.println("book deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
