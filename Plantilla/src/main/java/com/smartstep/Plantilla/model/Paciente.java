package com.smartstep.Plantilla.model;

import java.util.Date;

public class Paciente extends Usuario {
    private double peso;
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    private double altura;
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    private Date fechaNacimiento;
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    private String sexo;
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private int objetivoPasos;
    public int getObjetivoPasos() {
        return objetivoPasos;
    }
    public void setObjetivoPasos(int objetivoPasos) {
        this.objetivoPasos = objetivoPasos;
    }

    public Paciente(int id, String correo, String dni, String nombre, String apellidos, double peso, double altura, Date fechaNacimiento, String sexo, int objetivoPasos) {
        super(id, correo, dni, nombre, apellidos);
        this.peso = peso;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.objetivoPasos = objetivoPasos;
    }

    
}