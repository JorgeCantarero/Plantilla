package com.smartstep.Plantilla.model;

public class Paciente {
    private Long id;
    private String nombre;
    private String email;
//esto son algunos de los atributos
   
    private int objetivoPasos;
    private int minutosActividad;
    private String notasProfesional;

    public Paciente() {
    }

    public Paciente(Long id, String nombre, String email, int objetivoPasos, int minutosActividad, String notasProfesional) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.objetivoPasos = objetivoPasos;
        this.minutosActividad = minutosActividad;
        this.notasProfesional = notasProfesional;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getObjetivoPasos() {
        return objetivoPasos;
    }

    public void setObjetivoPasos(int objetivoPasos) {
        this.objetivoPasos = objetivoPasos;
    }

    public int getMinutosActividad() {
        return minutosActividad;
    }

    public void setMinutosActividad(int minutosActividad) {
        this.minutosActividad = minutosActividad;
    }

    public String getNotasProfesional() {
        return notasProfesional;
    }

    public void setNotasProfesional(String notasProfesional) {
        this.notasProfesional = notasProfesional;
    }
}