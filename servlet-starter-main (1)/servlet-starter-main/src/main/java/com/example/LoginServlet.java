package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/Login")
public class  LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String email =request.getParameter("email");
                String password =request.getParameter("password");
                String url = "jdbc:mysql://localhost:3306/login_db";
                String username = "root";
                String dbpassword="Shaikh@123";
                String sql = "SELECT name FROM users WHERE email = ? AND password = ?";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection(url,username,dbpassword);
                    PreparedStatement ps=conn.prepareStatement(sql);
                    ps.setString(1, email);
                    ps.setString(2, password);
                    ResultSet rs =ps.executeQuery();
                    if (rs.next()) {
                        String name=rs.getString("name");
                        HttpSession session=request.getSession();
                        session.setAttribute("name",name);
                        response.sendRedirect("Welcome.jsp");

                    }else {
                        response.setContentType("text/html");
                        response.getWriter().println(
                            "<h3>Invalid Email or Password </h3>"
                        );
                        response.getWriter().println(
                            "<a href=Login.jsp>Try Again</a>"
                        );
                    }
                    rs.close();
                    ps.close();
                    conn.close();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                    response.getWriter().println(
                         "<h3>Database Error: "+e.getMessage()+"</h3>"
                    );
                    
                    
                }


        
    }
}
