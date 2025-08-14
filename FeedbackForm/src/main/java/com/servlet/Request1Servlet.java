package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//@WebServlet("/Servlet1")
public class Request1Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<h1>servlet1 working</h1>");
		
		
		//servlet context k object-
		ServletContext servletContext=getServletContext();
		//servlet config k object-
		ServletConfig servletConfig=getServletConfig();
		
		
		//get data-
		String appname=servletContext.getInitParameter("appname"); //for each application
		String username=servletConfig.getInitParameter("username"); //for each servlet
		
		//print data on browser-
		writer.println(""" 
		<h3>appname:%s</h3>
		<h3>username:%s</h3>
		""".formatted(appname,username));
		
		
		
		
		
		
		
		
		
		
//		String name="diyajain";
//		String id="1234";
		
//		//create cookies-
//		Cookie cookie1 =new Cookie("username",name) ;
//		Cookie cookie2 =new Cookie("userid",id);
//	     cookie1.setMaxAge(10*60);
//	     cookie2.setMaxAge(10*60);
//		//through response we send cookies-
//		resp.addCookie(cookie1);
//		resp.addCookie(cookie2);
		
		
//		//use httpSession
//		HttpSession session=req.getSession();
//		session.setAttribute("username", name);
//		session.setAttribute("userid", id);      // to generate random id use this UUID.randomUUID().toString()
//		session.setMaxInactiveInterval(10*60);
	}
}
