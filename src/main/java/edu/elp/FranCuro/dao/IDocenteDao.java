package edu.elp.FranCuro.dao;

import edu.elp.FranCuro.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteDao extends JpaRepository<Docente, Long> {
}
