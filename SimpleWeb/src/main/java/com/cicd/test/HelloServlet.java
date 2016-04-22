package com.cicd.test;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cicd.util.Greeter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
	@Inject
	Greeter greeter = new Greeter();
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println("Servlet is called");
		res.getWriter().println(greeter.sayHello());
		
		
	}

}
