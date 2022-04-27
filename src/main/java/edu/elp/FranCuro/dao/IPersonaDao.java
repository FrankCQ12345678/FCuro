package edu.elp.FranCuro.dao;

import edu.elp.FranCuro.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface IPersonaDao extends JpaRepository<Persona,Long>  {

}
