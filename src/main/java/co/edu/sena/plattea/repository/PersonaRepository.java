package co.edu.sena.plattea.repository;

import co.edu.sena.plattea.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
