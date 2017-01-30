package com.controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BookDaoImpl;
import com.model.Book;

/**
 * Servlet implementation class BookController
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		 String authorname = request.getParameter("authorname");
	        String bookname = request.getParameter("bookname");
	        String topic=request.getParameter("topic");
	        
	        Book book = new Book();
	        
	        book.setAuthorname(authorname);
	        book.setBookname(bookname);
	        book.setTopics(topic);
	        
	        
	        BookDaoImpl bookdao=new BookDaoImpl();
	        
	        bookdao.addBook(book);
	        
	        List<Book> booklist = bookdao.getAllBooks();
	        
	        Iterator iterator=booklist.iterator();
	        
	        
	        
	        PrintWriter out = response.getWriter();
	        
	       
	        	
	        	
	        
	        
	        out.println("<html><head><style>"+"table, th, td {" +
    "border: 1px solid black;"+  
    "border-collapse: collapse;"+  
"}"+    

"th, td {"+ 
   " padding: 10px;"+  
"}"+  
"table#alter tr:nth-child(even) {"+   
   " background-color: #eee;"+  
"}"); 
   
 
out.print("table#alter tr:nth-child(odd) {"+
    "background-color: #fff;"+  
"}"+  
"table#alter th {"+
    "color: white;"+  
    "background-color: gray;"+  
"}"+  
"</style>"+  
"</head>"+  


"<body>"+  
"<table id=alter>"+"<tr><th>Author Name</th><th>Book Name</th><th>Topics</th></tr>"); 
while(iterator.hasNext())
{
	Book book1=(Book) iterator.next();
out.println(  
"<tr><td>"+book1.getAuthorname()+"</td><td>"+book1.getBookname()+"</td><td>"+book1.getTopics()+"</td></tr>");  
	         

	        
	        
	        
	        
	        
	         
	      //  System.out.println("username: " + authorname);
	      //  System.out.println("password: " + bookname);
	}
out.print(
"</table>"+   
"</body>"+
"</html>"
  );

}
}
