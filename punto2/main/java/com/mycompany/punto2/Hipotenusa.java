/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto2;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
/**
 *
 * @author Karen Andrea Herrera Betancur
 */
@WebServlet("/hipotenusa")
public class Hipotenusa extends HttpServlet {
     @Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
PrintWriter out = respuesta.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html lang='es' >");
out.println("<head>");
out.println("<title>HIPOTENUSA</title>");            
out.println("</head>");
out.println("<body>");
double ct1=Double.valueOf (peticion.getParameter("cateto1"));
double ct2=Double.valueOf (peticion.getParameter("cateto2"));
out.println("<strong><p>LA HIPOTENUSA ES:  </p></strong>");
out.println("<p>"+Math.hypot(ct1, ct2)+"</p>");
out.println("</body>");
out.println("</html>");

}
    
}
