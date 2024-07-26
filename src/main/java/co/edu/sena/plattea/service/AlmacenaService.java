package co.edu.sena.plattea.service;

import co.edu.sena.plattea.model.Almacena;
import co.edu.sena.plattea.model.AlmacenaId;
import co.edu.sena.plattea.repository.AlmacenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlmacenaService {

    @Autowired
    private AlmacenaRepository almacenaRepository;

    public List<Almacena> findAll() {
        return almacenaRepository.findAll();
    }

    public Optional<Almacena> findById(AlmacenaId id) {
        return almacenaRepository.findById(id);
    }

    public Almacena save(Almacena almacena) {
        return almacenaRepository.save(almacena);
    }

    public void deleteById(AlmacenaId id) {
        almacenaRepository.deleteById(id);
    }
}
