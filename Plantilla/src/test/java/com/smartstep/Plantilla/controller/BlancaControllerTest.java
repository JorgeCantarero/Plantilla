package com.smartstep.Plantilla.controller;

import com.smartstep.Plantilla.model.Paciente;
import com.smartstep.Plantilla.model.Profesional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BlancaControllerTest {

    private final BlancaController controller = new BlancaController();

    @Test
    void actualizaObjetivosDelPacienteDelProfesional() {
        Paciente paciente = new Paciente(1L, "Ana", "ana@example.com", 5000, 20, "");
        Profesional profesional = new Profesional();
        profesional.agregarPaciente(paciente);

        boolean actualizado = controller.actualizarObjetivosActividadFisica(
                profesional, 1L, 8000, 45, "Aumentar actividad gradualmente");

        assertTrue(actualizado);
        assertEquals(8000, paciente.getObjetivoPasos());
        assertEquals(45, paciente.getMinutosActividad());
        assertEquals("Aumentar actividad gradualmente", paciente.getNotasProfesional());
    }

    @Test
    void devuelveFalseSiElPacienteNoPerteneceAlProfesional() {
        Paciente paciente = new Paciente(1L, "Ana", "ana@example.com", 5000, 20, "");
        Profesional profesional = new Profesional();
        profesional.agregarPaciente(paciente);

        boolean actualizado = controller.actualizarObjetivosActividadFisica(
                profesional, 2L, 8000, 45, "Nuevas notas");

        assertFalse(actualizado);
        assertEquals(5000, paciente.getObjetivoPasos());
        assertEquals(20, paciente.getMinutosActividad());
        assertEquals("", paciente.getNotasProfesional());
    }
}
