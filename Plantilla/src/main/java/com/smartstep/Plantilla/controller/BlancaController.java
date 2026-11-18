package com.smartstep.Plantilla.controller;

import com.smartstep.Plantilla.model.Paciente;
import com.smartstep.Plantilla.model.Profesional;

public class BlancaController {
    public boolean actualizarObjetivosActividadFisica(
            Profesional profesional,
            Long pacienteId,
            int objetivoPasos,
            int minutosActividad,
            String notasProfesional) {
        if (profesional == null || pacienteId == null || profesional.getPacientes() == null) {
            return false;
        }

        for (Paciente paciente : profesional.getPacientes()) {
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
