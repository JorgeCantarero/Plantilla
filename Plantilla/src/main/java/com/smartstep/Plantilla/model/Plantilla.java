package com.smartstep.Plantilla.model;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

public class Plantilla {
    @Id
    private int numSerie;
    private int nivelBateria;
    private double peso;
    private List<Medicion> mediciones;
    
    public Plantilla() {
        // Constructor vacío requerido por JPA
    }

    // Constructor
    public Plantilla(int numSerie, int nivelBateria, double peso) {
        this.numSerie = numSerie;
        this.nivelBateria = nivelBateria;
        this.peso = peso;
    }

    // Getters and Setters
    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public List<Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(List<Medicion> mediciones) {
        this.mediciones = mediciones;
    }
}