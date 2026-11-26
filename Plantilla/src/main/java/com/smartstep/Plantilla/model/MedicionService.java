package com.smartstep.Plantilla.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class MedicionService {
    @Autowired 
    RepositoryMedicion repositoryMedicion;

    public void guardarMedicion(Medicion medicion) {
        repositoryMedicion.saveAndFlush(medicion);
    }

    public Medicion obtenerMedicionPorId(int id) {
        return repositoryMedicion.findById(id).orElse(null);
    }

    public void eliminarMedicion(int id) {
        repositoryMedicion.deleteById(id);
    }

    public void actualizarMedicion(Medicion medicion) {
        repositoryMedicion.save(medicion);
    }

    public List<Medicion> obtenerTodasLasMediciones() {
        return repositoryMedicion.findAll();
    }
}
