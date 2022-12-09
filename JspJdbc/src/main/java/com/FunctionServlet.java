package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FunctionServlet")
public class FunctionServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse rs) throws IOException , ServletException
	{
		
		RequestDispatcher rd=req.getRequestDispatcher("func.jsp");
		rd.forward(req, rs);
	}


}
