package com.smartstep.Plantilla.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    @Autowired 
    RepositorySensor repositorySensor;

    public void guardarSensor(Sensor sensor) {
        repositorySensor.save(sensor);
    }

    public Sensor obtenerSensorPorId(int id) {
        return repositorySensor.findById(id).orElse(null);
    }

    public void eliminarSensor(int id) {
        repositorySensor.deleteById(id);
    }

    public void actualizarSensor(Sensor sensor) {
        repositorySensor.save(sensor);
    }

    public List<Sensor> obtenerTodosLosSensores() {
        return repositorySensor.findAll();
    }
}
