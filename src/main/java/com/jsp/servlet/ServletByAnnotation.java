package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/form3") - It doesn't work because that web.xml is there in project
public class ServletByAnnotation extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("Fetch From Client Request: "+ req.getParameter("fname")+" " + req.getParameter("lname"));
	}

	
}
