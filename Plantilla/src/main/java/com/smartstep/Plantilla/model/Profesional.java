package com.smartstep.Plantilla.model;

import java.util.ArrayList;
import java.util.List;

public class Profesional {
    private Long id;
    private String nombre;
    private String especialidad;
    private List<Paciente> pacientes;

    public Profesional() {
        this.pacientes = new ArrayList<>();
    }

    public Profesional(Long id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pacientes = new ArrayList<>();
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    // Método de utilidad para asignar un paciente al profesional
    public void agregarPaciente(Paciente paciente) {
        if (this.pacientes == null) {
            this.pacientes = new ArrayList<>();
        }
        this.pacientes.add(paciente);
    }

    public boolean actualizarObjetivos(
            Long pacienteId,
            int objetivoPasos,
            int minutosActividad,
            String notasProfesional) {
        if (pacienteId == null || pacientes == null) {
            return false;
        }

        for (Paciente paciente : pacientes) {
            if (paciente != null && pacienteId.equals(paciente.getId())) {
                paciente.setObjetivoPasos(objetivoPasos);
                paciente.setMinutosActividad(minutosActividad);
                paciente.setNotasProfesional(notasProfesional);
                return true;
            }
        }

        return false;
    }
}