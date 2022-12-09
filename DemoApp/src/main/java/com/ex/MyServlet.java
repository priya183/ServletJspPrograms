package com.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("Hi ");
		//to fetch value of name and phone we need ServletContext and ServletConfig both are interfaces
		//getServletContext get from httpServlet becoz it inherit GenericServlet
		/*ServletContext s=getServletContext();
		//getInit method will used to provide the name of attribute which u pass
		String name=s.getInitParameter("name");
		pw.println(name);
		
		String phone=s.getInitParameter("phone");
		pw.println(phone);*/
		
		ServletConfig c=getServletConfig();
		String name=c.getInitParameter("name");
		pw.println(name);
		
		
	}

}
