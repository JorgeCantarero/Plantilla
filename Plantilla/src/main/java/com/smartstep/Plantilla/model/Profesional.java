package com.smartstep.Plantilla.model;

import java.util.ArrayList;
import java.util.List;

public class Profesional extends Usuario {
    private int id; //aqui he cambiado de long a int
    //para que sea compatible con la clase usuario
    private String nombre;
    private String especialidad;
    private List<Paciente> pacientes;
    private int minutosActividad;
    private String notasProfesional;

    public Profesional() {
        super();
        this.pacientes = new ArrayList<>();
    }

    public Profesional(int id, String nombre, String especialidad) {
        super(id, null, null, nombre, null);
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pacientes = new ArrayList<>();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
            int pacienteId,
            int objetivoPasos) {
        if (pacientes == null) {
            return false;
        }

        for (Paciente paciente : pacientes) {
            if (paciente != null && pacienteId == paciente.getId()) {
                paciente.setObjetivoPasos(objetivoPasos);
                paciente.setMinutosActividad(minutosActividad);
                paciente.setNotasProfesional(notasProfesional);
                return true;
            }
        }

        return false;
    }
}