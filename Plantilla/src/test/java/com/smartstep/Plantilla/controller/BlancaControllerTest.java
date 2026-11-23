package com.smartstep.Plantilla.controller;

import com.smartstep.Plantilla.model.Paciente;
import com.smartstep.Plantilla.model.Profesional;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class actualizarObjetivosActividadFisicaControllerTest {

    private final actualizarObjetivosActividadFisicaController controller = new actualizarObjetivosActividadFisicaController();

    @Test
    void actualizaObjetivosDelPacienteDelProfesional() {
        Paciente paciente = new Paciente(
                1, "ana@example.com", "12345678A", "Ana", "Lopez",
                60, 1.65, new Date(0), "F", 5000);
        Profesional profesional = new Profesional();
        profesional.agregarPaciente(paciente);

        boolean actualizado = controller.actualizarObjetivosActividadFisica(
                profesional, 1, 8000);

        assertTrue(actualizado);
        assertEquals(8000, paciente.getObjetivoPasos());
    }

    @Test
    void devuelveFalseSiElPacienteNoPerteneceAlProfesional() {
        Paciente paciente = new Paciente(
                1, "ana@example.com", "12345678A", "Ana", "Lopez",
                60, 1.65, new Date(0), "F", 5000);
        Profesional profesional = new Profesional();
        profesional.agregarPaciente(paciente);

        boolean actualizado = controller.actualizarObjetivosActividadFisica(
                profesional, 2, 8000);

        assertFalse(actualizado);
        assertEquals(5000, paciente.getObjetivoPasos());
    }
}
