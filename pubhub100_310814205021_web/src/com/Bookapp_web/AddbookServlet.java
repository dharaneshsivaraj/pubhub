package com.Bookapp_web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.BookDAO;
import com.model.Book;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("AddbookServlet")
public class AddbookServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
			String name=request.getParameter("name");
			int price=Integer.parseInt(request.getParameter("price"));
			Book book = new Book();
			book.setName("name");
			book.setPrice(price);
			BookDAO bookDAO=new BookDAO();
			try {
				bookDAO.add(book);
				response.sendRedirect("dummy.jsp");
				System.out.println("success");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
