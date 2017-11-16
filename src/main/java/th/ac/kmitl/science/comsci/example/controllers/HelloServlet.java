package th.ac.kmitl.science.comsci.example.controllers;

import th.ac.kmitl.science.comsci.example.models.Hello;
import th.ac.kmitl.science.comsci.example.nameprinters.NamePrinterLoader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet
        extends HttpServlet {

    public HelloServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = new Hello().getMessage();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        out.println("<ul>");
<<<<<<< HEAD
        out.println("<li>Bearchitect</li>");
        out.println("<li>58050237 Chayapol Limanon</li>");
	out.println("<li>58050231 Pattharachat Chanakitkumjorn</li>");
=======
        
        NamePrinterLoader.getInstance().printAllNames(out);
        
>>>>>>> upstream/master
        out.println("</ul>");
	
    }
}
