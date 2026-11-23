package com.smartstep.Plantilla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.smartstep.Plantilla.model.Medicion;
import com.smartstep.Plantilla.model.MedicionService;

public class MedicionController {
    @Autowired 
    MedicionService medicionService;

    @GetMapping("/mediciones")
    public List<Medicion> obtenerTodasLasMediciones() {
        return medicionService.obtenerTodasLasMediciones();
    }
}
