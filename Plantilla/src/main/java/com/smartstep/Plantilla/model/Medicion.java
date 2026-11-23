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
    private Date fecha;
    @ManyToOne 
    private Sensor sensor; // Referencia al sensor al que pertenece la medición

    // Constructor
    public Medicion(int id, double presion, Date fecha, Sensor sensorId) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}