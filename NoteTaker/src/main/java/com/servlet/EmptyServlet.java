package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entities.Note;
import com.helper.FactoryProvider;

public class EmptyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EmptyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			// Get session from FactoryProvider (singleton)
            Session s = FactoryProvider.getFactory().openSession();
          

          
            
            Query query = s.createQuery("SELECT COUNT(*) FROM Note");
            Long count = (Long) query.uniqueResult();
            s.close();

            if (count == 0) {
                System.out.println("The Note table is empty.");
              //display on web-browser
                response.setContentType("text/html");
                PrintWriter w=response.getWriter();
                w.print("<h1 style='text-align:center;'>empty!</h1>");
                w.print("<h1 style='text-align:center;'><a href='add_note.jsp'>Add notes</a></h1>");
                
                
            } else {
                System.out.println("The Note table contains " + count + " records.");
                response.sendRedirect("all_notes.jsp");
            }
            
            
    
            s.close();

       

			
			
		}catch(Exception e) {
			e.getStackTrace();
		}

	}


}
