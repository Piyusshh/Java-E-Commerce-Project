package com.bookstore.controller.frontend;

import com.bookstore.controller.BaseServlet;
import com.bookstore.service.BookServices;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view_category")
public class ViewBookByCategoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

    
    public ViewBookByCategoryServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		BookServices bookservices = new BookServices(entityManager, request, response);
		bookservices.listBookByCategory();
	}

}
