package com.webjava.registropersonas.model;

public class Usuario {
    private String nombre, rut;
    private int edad;

    public Usuario(String nombre, String rut, int edad){
        this.nombre=nombre;
        this.rut = rut;
        this.edad=edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}