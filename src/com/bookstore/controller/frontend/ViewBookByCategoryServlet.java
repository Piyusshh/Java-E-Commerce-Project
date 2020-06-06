package com.bookstore.controller.frontend;

import com.bookstore.service.BookServices;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view_category")
public class ViewBookByCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ViewBookByCategoryServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		BookServices bookservices = new BookServices(request, response);
		bookservices.listBookByCategory();
	}

}
