package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/Add")
public class AddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int n1=Integer.parseInt(request.getParameter("num1"));
        int n2=Integer.parseInt(request.getParameter("num2"));
        int sum=n1+n2;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Adding the number </h1>");
         out.println("<h2> sum ="+sum+" </h2>");
       
    }
}
 
