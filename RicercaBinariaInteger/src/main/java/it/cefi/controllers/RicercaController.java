package it.cefi.controllers;

import java.io.IOException;

import it.cefi.models.RicercaModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/controlla")
public class RicercaController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		
		int input = Integer.parseInt( request.getParameter("input"));
		String output = RicercaModel.status(RicercaModel.list, input);
		
		request.setAttribute("output", output);
		
		dispatcher.forward(request, response);
	}
}
