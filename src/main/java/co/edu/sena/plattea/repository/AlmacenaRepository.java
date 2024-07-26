package co.edu.sena.plattea.repository;

import co.edu.sena.plattea.model.Almacena;
import co.edu.sena.plattea.model.AlmacenaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlmacenaRepository extends JpaRepository<Almacena, AlmacenaId> {
}
