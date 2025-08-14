package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entities.Note;
import com.helper.FactoryProvider;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//fetch noteid
			int noteId=Integer.parseInt(request.getParameter("note_id").trim());
			 
			// Get session from FactoryProvider (singleton)
            Session s = FactoryProvider.getFactory().openSession();
            Transaction tx = s.beginTransaction();

            // delete the note
            Note note=(Note) s.get(Note.class, noteId);
            s.delete(note);
            
            
            Query query = s.createQuery("SELECT COUNT(*) FROM Note");
            Long count = (Long) ((org.hibernate.query.Query) query).uniqueResult();
            int result = count.intValue(); // Convert Long to int
            if(result==0) {
            	//display on web-browser
                response.setContentType("text/html");
                PrintWriter w=response.getWriter();
                w.print("<h1 style='text-align:center;'>empty!</h1>");
                w.print("<h1 style='text-align:center;'><a href='index.jsp'>Go back to main page</a></h1>");

            }
            else {

                //redirect to the page 
                 response.sendRedirect("all_notes.jsp");
            }
            
            
            
        
            
            
            tx.commit();
            s.close();

            System.out.println("Note deleted successfully");

			
			
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

	

}
