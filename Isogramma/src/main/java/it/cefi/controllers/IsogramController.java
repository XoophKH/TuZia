package it.cefi.controllers;

import java.io.IOException;

import it.cefi.models.Isogram;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class IsogramController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		
		
		String input = request.getParameter("frase");
		String output = Isogram.statusString(input);
		
		request.setAttribute("output", output);
		
		dispatcher.forward(request, response);

	}
	
}
