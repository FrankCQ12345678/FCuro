package edu.elp.FranCuro.service;

import edu.elp.FranCuro.entity.Direccion;
import edu.elp.FranCuro.entity.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEstudianteService {
    List<Estudiante> listaEstudiantesByEscuela(Direccion idireccion);


    Page<Estudiante> listaEstudiantesPorPagina(Pageable pageable, Direccion idireccion);


    Estudiante guardarEstudiante(Estudiante estudiante);


    Estudiante obtenerPorCodigoOrDni(String coddni);


    void eliminarEstudiante(Long id);

    void actualizarEstudiante(Estudiante estudiante);
}
