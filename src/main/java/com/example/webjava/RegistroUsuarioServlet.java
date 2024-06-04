package com.example.webjava;

import java.io.*;

import com.webjava.registropersonas.controller.UsuarioController;
import com.webjava.registropersonas.model.Usuario;
import com.webjava.registropersonas.model.data.DBGenerator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name="registroUsuarioServlet", value="/registroUsuario")
public class RegistroUsuarioServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroUsuario.jsp");
        respuesta.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("edad").length()==0 || req.getParameter("rut").length()==0 || req.getParameter("nombre").length()==0 ){
            RequestDispatcher respuesta = req.getRequestDispatcher("/registroErroneo.jsp");
            respuesta.forward(req,resp);
        }
        else{
            String nombre = req.getParameter("nombre");
            String rut = req.getParameter("rut");
            int edad = Integer.parseInt(req.getParameter("edad"));
            // DA ERROR UsuarioController.registrarUsuario(nombre,rut,edad);
            RequestDispatcher respuesta = req.getRequestDispatcher("/registroCorrecto.jsp");
            respuesta.forward(req,resp);

        }
    }
}