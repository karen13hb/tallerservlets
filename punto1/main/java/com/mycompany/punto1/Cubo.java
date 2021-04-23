/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punto1;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
/**
 *
 * @author Karen Andrea Herrera Betancur
 */

@WebServlet("/cubo")

public class Cubo extends HttpServlet{
    @Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
PrintWriter salida = respuesta.getWriter();
int  b= Integer.valueOf (peticion.getParameter("base"));
salida.println("El numero al cubo es: "+ Math.pow(b, 3));
}

}
