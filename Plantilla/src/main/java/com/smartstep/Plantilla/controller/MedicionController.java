package com.smartstep.Plantilla.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    // Crea una medición con el objeto Medicion recibido en formato JSON
    @PostMapping(value = "/medicion" , consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveMedicion(@RequestBody Medicion medicion) {
        try{
            medicionService.guardarMedicion(medicion);
            return ResponseEntity.ok().body("Una nueva medición se ha añadido");
        }
        catch(Exception e){
            return ResponseEntity.internalServerError().body("La medición ya existe");
        }
    }
}
