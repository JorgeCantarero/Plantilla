package com.smartstep.Plantilla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartstep.Plantilla.model.*;

@RestController
public class SensorController {
    @Autowired 
    SensorService sensorService;

    //Devuelve todos los sensores
    @GetMapping("/sensores")
    public List<Sensor> getSensores(){
        return sensorService.obtenerTodosLosSensores();
    }
    
    //Devuelve el sensor con el id proporcionado
    @GetMapping("/sensor/{id}")
    public Sensor getSensorById(@PathVariable int id){
        return sensorService.obtenerSensorPorId(id);
    }

    //Crea un sensor a partir de un JSON
    @PostMapping(value = "/sensor" , consumes = {MediaType.APPLICATION_JSON_VALUE} )
    public ResponseEntity<?> saveSensor(@RequestBody Sensor sensor) {
        try{
            sensorService.guardarSensor(sensor);
            return ResponseEntity.ok().body("Un nuevo sensor se ha añadido");
        }
        catch(Exception e){ 
            return ResponseEntity.internalServerError().body("El sensor ya existe");
        }
    }


    

   
}