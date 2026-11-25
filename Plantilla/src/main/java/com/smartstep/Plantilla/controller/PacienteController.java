package com.smartstep.Plantilla.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController 
public class PacienteController {
    public int consultarPasos(int idPaciente) {
        //Devolvemos un valor ficticio de pasos para el paciente con el id proporcionado
        //debido a que necesitaríamos una base de datos o una fuente de datos externa 
        // para obtener los pasos reales.
        int objetivoPasos = 10000; // Valor ficticio de pasos
        return objetivoPasos; 
    }
}
