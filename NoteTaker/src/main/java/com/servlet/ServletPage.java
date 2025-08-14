package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Note;
import com.helper.FactoryProvider;



public class ServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Fetching title and content
            String title = request.getParameter("TITLE");
            String content = request.getParameter("CONTENT");

            // Create Note object
            Note note = new Note(title, content, new Date());
            System.out.println("Received note: " + note.getTitle());

            // Get session from FactoryProvider (singleton)
            Session s = FactoryProvider.getFactory().openSession();
            Transaction tx = s.beginTransaction();

            // Save the note
            s.save(note);
            tx.commit();
            s.close();

            System.out.println("Note saved successfully");

           //display on web-browser
            response.setContentType("text/html");
            PrintWriter w=response.getWriter();
            w.print("<h1 style='text-align:center;'>Notes Saved Successfully!</h1>");
            w.print("<h1 style='text-align:center;'><a href='all_notes.jsp'>View all notes</a></h1>");

        } catch (Exception e) {
            e.printStackTrace(); // Print the full stack trace
        }
    }

}
