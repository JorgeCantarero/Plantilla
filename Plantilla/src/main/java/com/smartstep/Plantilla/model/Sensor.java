package com.smartstep.Plantilla.model;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Sensor {
    @Id
    private int id;
    private List<String> coordenadas;

    protected Sensor() {
    }

    // Constructor
    public Sensor(int id, List<String> coordenadas) {
        this.id = id;
        this.coordenadas = coordenadas;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(List<String> cooredenadas) {
        this.coordenadas = cooredenadas;
    }
}