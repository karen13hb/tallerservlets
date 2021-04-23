/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto4;

/**
 *
 * @author Karen
 */
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
/**
 *
 * @author Karen Andrea Herrera Betancur
 */
@WebServlet("/vistas")
public class Vistas extends HttpServlet {
    
    
    
     @Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
Integer variablesesion =0;
HttpSession misesion= peticion.getSession();
PrintWriter out = respuesta.getWriter();

variablesesion=(Integer)misesion.getAttribute("numero");
if(variablesesion == null){
    variablesesion=0;
}

out.println("<!DOCTYPE html>");
out.println("<html lang='es' >");
out.println("<head>");
out.println("<title>VISTAS</title>");            
out.println("</head>");
out.println("<body>");
out.println("<strong><p>CONTADOR DE VISTAS: "+variablesesion+" </p></strong>");
out.println("<p></p>");
out.println("</body>");
out.println("</html>");
variablesesion++;

misesion.setAttribute("numero", variablesesion);


}
    
}