package com.webjava.registropersonas.controller;

import com.webjava.registropersonas.model.Usuario;
import com.webjava.registropersonas.model.data.DBConnector;
import com.webjava.registropersonas.model.data.DBGenerator;
import com.webjava.registropersonas.model.data.dao.UsuarioDAO;
import org.jooq.DSLContext;

public class UsuarioController {
    public static boolean registrarUsuario(String nombre, String rut, int edad) throws ClassNotFoundException {
        DSLContext query = DBGenerator.conectarBD("Web");
        if(!UsuarioDAO.validarExistenciaUsuario(query,"rut",rut)){
            Usuario usuario= new Usuario(nombre,rut,edad);
            UsuarioDAO.agregarUsuario(query,usuario);
            DBConnector.closeConnection();
            return true;
        }
        else{
            DBConnector.closeConnection();
            return false;
        }
    }
}
