package com.smartstep.Plantilla.model;

public class Usuario {
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String correo;
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    private String dni;
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String apellidos;
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Usuario(int id, String correo, String dni, String nombre, String apellidos) {
        this.id = id;
        this.correo = correo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
