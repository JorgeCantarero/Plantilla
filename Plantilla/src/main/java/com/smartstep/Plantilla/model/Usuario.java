package com.smartstep.Plantilla.model;

public class Usuario {
    private int id;
    private String correo;
    private String dni;
    private String nombre;
    private String apellidos;

    public Usuario() {
    }
    
    //Constructor de la clase Usuario
    public Usuario(int id, String correo, String dni, String nombre, String apellidos) {
        this.id = id;
        this.correo = correo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

       public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    
}
