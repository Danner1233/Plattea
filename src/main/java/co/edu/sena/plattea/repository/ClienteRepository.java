package co.edu.sena.plattea.repository;

import co.edu.sena.plattea.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
