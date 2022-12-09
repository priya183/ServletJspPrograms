package com;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse rs) throws IOException , ServletException
	{
		//for single object
		Student s=new Student(101,"priya");
		
		//for multiple object
		List<Student> studs=Arrays.asList(new Student(1,"AA"),new Student(2,"BB"),
				new Student(3,"CC"));
		req.setAttribute("student",s);
		req.setAttribute("students",studs);
		RequestDispatcher rd=req.getRequestDispatcher("stud.jsp");
		rd.forward(req, rs);
	}

}
