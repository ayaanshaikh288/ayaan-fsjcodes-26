package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/Welcome")
public class WelcomeServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        String myname=request.getParameter("myname");
        int a=Integer.parseInt(request.getParameter("age"));
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> welcome "+myname+" to Rizvi College of engineering</h1>");
        
        out.println("<h2> Your age is "+a+"</h2>");
        
    }
}
