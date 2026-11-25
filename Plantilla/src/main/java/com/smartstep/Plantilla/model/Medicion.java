package com.smartstep.Plantilla.model;

import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Medicion {
    @Id
    private int id;
    private double presion;
    private String fecha;
    @ManyToOne
    private Sensor sensor; // Referencia al sensor al que pertenece la medición

    public Medicion() {
        // Constructor vacío requerido por JPA
    }

    // Constructor
    public Medicion(int id, double presion, String fecha, Sensor sensorId) {
        this.id = id;
        this.presion = presion;
        this.fecha = fecha;
        this.sensor = sensorId;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}