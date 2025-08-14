package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.entities.FeedBack;
import com.helper.FactoryProvider;
@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    //form data: get krna hai
		String email=req.getParameter("email");
		String phoneno=req.getParameter("phonenumber");
		String feedback=req.getParameter("feedback");
		
		
		//save data to database-
		FeedBack feedback1=new FeedBack(email,phoneno,feedback);
		//get SessionFactory-
		FactoryProvider factoryProvider=new FactoryProvider();
	    SessionFactory factory= factoryProvider.getFactory();
	    Session session=factory.openSession();
	    Transaction tx=session.beginTransaction();
	    session.persist(feedback1);
	    tx.commit();
		session.close();
		
		
		//response dena hoga
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<h1>Feedback servlet working</h1>");
		writer.println(""" 
				<h2>Your form details that you have submitted</h2> 
				<h3>email:%s</h3>
				<h3>phoneNumber:%s</h3>
				<h3>feedback:%s</h3>
				""".formatted(email,phoneno,feedback));
		}
	

}
