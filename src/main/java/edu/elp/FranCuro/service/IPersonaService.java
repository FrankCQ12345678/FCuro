package edu.elp.FranCuro.service;

import edu.elp.FranCuro.entity.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> listaPersonas();

    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String dni);
}
