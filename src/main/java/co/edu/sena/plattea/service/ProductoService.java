package co.edu.sena.plattea.service;

import co.edu.sena.plattea.model.Producto;
import co.edu.sena.plattea.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Optional<Producto> findById(Integer id) {
        return productoRepository.findById(id);
    }

    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    public void deleteById(Integer id) {
        productoRepository.deleteById(id);
    }
}
