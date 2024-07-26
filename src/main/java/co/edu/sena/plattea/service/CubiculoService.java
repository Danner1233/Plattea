package co.edu.sena.plattea.service;

import co.edu.sena.plattea.model.Cubiculo;
import co.edu.sena.plattea.repository.CubiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CubiculoService {

    @Autowired
    private CubiculoRepository cubiculoRepository;

    public List<Cubiculo> findAll() {
        return cubiculoRepository.findAll();
    }

    public Optional<Cubiculo> findById(Integer id) {
        return cubiculoRepository.findById(id);
    }

    public Cubiculo save(Cubiculo cubiculo) {
        return cubiculoRepository.save(cubiculo);
    }

    public void deleteById(Integer id) {
        cubiculoRepository.deleteById(id);
    }
}
