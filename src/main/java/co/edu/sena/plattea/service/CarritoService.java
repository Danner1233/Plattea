package co.edu.sena.plattea.service;

import co.edu.sena.plattea.model.Carrito;
import co.edu.sena.plattea.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    public List<Carrito> findAll() {
        return carritoRepository.findAll();
    }

    public Optional<Carrito> findById(Integer id) {
        return carritoRepository.findById(id);
    }

    public Carrito save(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    public void deleteById(Integer id) {
        carritoRepository.deleteById(id);
    }
}
