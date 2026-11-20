package com.smartstep.Plantilla.model;

import com.smartstep.Plantilla.controller.PacienteController;

public class EstrategiaPaciente implements IConsultaDatos {
    private PacienteController pacienteController;
   
    @Override 
    public int consultarPasos(int idPaciente) {
        // Llamamos al método del controlador para obtener los pasos del paciente
        return pacienteController.consultarPasos(idPaciente);
    }
    
}
