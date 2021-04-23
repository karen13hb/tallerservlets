/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto3;

/**
 *
 * @author Karen Andrea Herrera Betancur
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
@WebServlet("/array")
public class Arrays extends HttpServlet {
    ArrayList<Double> lista1;
    
    int longitud;
    @Override
    public void init(){
           
    longitud = 10;
    lista1 = new ArrayList<>(longitud);
    
    Random random = new Random();
    for(int i=0;i<longitud;i++){
        lista1.add(random.nextDouble());
        
    }
    }
    
    
     @Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
PrintWriter out = respuesta.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html lang='es' >");
out.println("<head>");
out.println("<title>VISTAS</title>");            
out.println("</head>");
out.println("<body>");
double array1=0;

for(int i=0;i<lista1.size();i++){
        array1+=lista1.get(i);
        
    }
out.println("<strong><p>LA SUMA DEL ARRAY ES:  </p></strong>");
out.println("<p>"+array1+"</p>");
out.println("</body>");
out.println("</html>");


}
    
}