package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Fetching title and content
            String Ntitle = request.getParameter("TITLE");
            String Ncontent = request.getParameter("CONTENT");
            int noteId= Integer.parseInt(request.getParameter("ID").trim());
       

        

            // Get session from FactoryProvider (singleton)
            Session s = FactoryProvider.getFactory().openSession();
            Transaction tx = s.beginTransaction();

            // update the note
            //option-1 
//            String query="update Note set title=:x,content=:y,addeddate=:d  where id=:z";
//            Date date=new Date();
//            Query q=s.createQuery(query);
//            q.setParameter("x", Ntitle);
//            q.setParameter("y", Ncontent);
//            q.setParameter("z", noteId);
//            q.setParameter("d", date);
//            int r=q.executeUpdate();
          
            
            //option-2
            Note note=(Note)s.get(Note.class, noteId);
            note.setContent(Ncontent);
            note.setTitle(Ntitle);
            note.setAddeddate(new Date());
          
            
            
            
            
            tx.commit();
            s.close();

            System.out.println("Note update successfully");

            //display on web-browser
//            response.setContentType("text/html");
//            PrintWriter w=response.getWriter();
//            w.print("<h1 style='text-align:center;'>Notes update Successfully!</h1>");
//            w.print("<h1 style='text-align:center;'><a href='all_notes.jsp'>View all notes</a></h1>");
            response.sendRedirect("all_notes.jsp");
            

        } catch (Exception e) {
            e.printStackTrace(); // Print the full stack trace
        }
    }
	
	
}
