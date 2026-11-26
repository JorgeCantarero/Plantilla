package com.smartstep.Plantilla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smartstep.Plantilla.model.Medicion;
import com.smartstep.Plantilla.model.MedicionService;


@RestController
public class MedicionController {
    @Autowired 
    MedicionService medicionService;

    @GetMapping("/mediciones")
    public List<Medicion> obtenerTodasLasMediciones() {
        return medicionService.obtenerTodasLasMediciones();
    }

    //Devuelve la medición con el id proporcionado
    @GetMapping("/medicion/{id}")
    public Medicion obtenerMedicionPorId(@PathVariable int id) {
        return medicionService.obtenerMedicionPorId(id);
    }
}
