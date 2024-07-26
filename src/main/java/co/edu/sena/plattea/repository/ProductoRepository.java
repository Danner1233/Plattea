package co.edu.sena.plattea.repository;

import co.edu.sena.plattea.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
