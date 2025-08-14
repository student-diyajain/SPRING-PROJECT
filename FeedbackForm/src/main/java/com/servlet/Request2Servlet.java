package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Servlet2")
public class Request2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	            resp.setContentType("text/html");
				PrintWriter writer=resp.getWriter();
				writer.println("<h1>servlet2 working</h1>");
				
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
				
				
				
				
				
						
//		//check is cookie there?	
//		//if yes,cookies ko get krenge-	
//				boolean flag=false;
//				Cookie [] cookies =req.getCookies();
//			    if(cookies!=null) {      //cookie available hai
//			    	for(Cookie c:cookies) {
//			    		String name=c.getName();
//			    		if(name.equals("username")) {
//			    			writer.println("<h3>username: %s</h3>".formatted(c.getValue()));
//			    			flag=true;    //cookie milchuki hai
//			    		}else if(name.equals("userid")) {
//			    			writer.println("<h3>userid: %s</h3>".formatted(c.getValue()));
//			    			flag=true;    //cookie milchuki hai
//			    		}
//			    	}
//			    }else{   //cookie available hi nhi hai
//					writer.println("<h3>cookie is null!</h3>");
//			    } 
//			    if(!flag){   //cookie nhi mili hai
//					writer.println("<h3>username cookie is not there in request</h3>");
//				}
				
				
//				HttpSession session=req.getSession();
//				String name=(String) session.getAttribute("username");
//				String id=(String) session.getAttribute("userid");
//				writer.println(""" 
//						<h3>username:%s</h3>
//						<h3>userid:%s</h3>
//						""".formatted(name,id));
			
         }
				
}


