package co.edu.sena.plattea.service;

import co.edu.sena.plattea.model.Arrendatario;
import co.edu.sena.plattea.repository.ArrendatarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArrendatarioService {

    @Autowired
    private ArrendatarioRepository arrendatarioRepository;

    public List<Arrendatario> findAll() {
        return arrendatarioRepository.findAll();
    }

    public Optional<Arrendatario> findById(Integer id) {
        return arrendatarioRepository.findById(id);
    }

    public Arrendatario save(Arrendatario arrendatario) {
        return arrendatarioRepository.save(arrendatario);
    }

    public void deleteById(Integer id) {
        arrendatarioRepository.deleteById(id);
    }
}
