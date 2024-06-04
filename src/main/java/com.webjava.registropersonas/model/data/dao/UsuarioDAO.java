package com.webjava.registropersonas.model.data.dao;

import com.webjava.registropersonas.model.Usuario;
import org.jooq.*;
import org.jooq.impl.DSL;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class UsuarioDAO {

    public static boolean validarExistenciaUsuario(DSLContext query, String columnaTabla, Object dato){
        Result resultados = query.select().from(table("Usuario")).where(DSL.field(columnaTabla).eq(dato)).fetch();
        if(resultados.size()>=1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void agregarUsuario(DSLContext query, Usuario usuario){
        Table tablaUsuario = table(name("Usuario"));
        Field[] columnas = tablaUsuario.fields("nombre","rut","edad");
        query.insertInto(tablaUsuario, columnas[0], columnas[1],columnas[2])
                .values(usuario.getNombre(),usuario.getRut(),usuario.getEdad())
                .execute();

    }


}
