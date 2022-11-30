package it.cefi.controllers;

import java.io.IOException;

import it.cefi.models.RicercaModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/inserisci")
public class ListaController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
		int inputList = Integer.parseInt(request.getParameter("insert"));
		
		 if(!RicercaModel.isContiene(RicercaModel.list, inputList)){ 
		 RicercaModel.list.add(inputList);
		 } 
		
		request.setAttribute("inputList", inputList);
		
		dispatcher.forward(request, response);
	}
}