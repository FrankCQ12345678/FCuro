package edu.elp.FranCuro.service.impl;

import edu.elp.FranCuro.dao.IPersonaDao;
import edu.elp.FranCuro.entity.Persona;
import edu.elp.FranCuro.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PersonaServiceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersonas() {

        List<Persona> personaList = this.personaDao.findAll();

        for (Persona persona: personaList){
            System.out.println(persona.toString());
        }

        return personaList;
    }

    @Override
    public Persona obtenerPersonaByDni(String dni) {
        return null;
    }
}
