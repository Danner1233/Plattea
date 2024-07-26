package co.edu.sena.plattea.service;

import co.edu.sena.plattea.model.Administrador;
import co.edu.sena.plattea.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministradorService {

    @Autowired
    private AdministradorRepository administradorRepository;

    public List<Administrador> findAll() {
        return administradorRepository.findAll();
    }

    public Optional<Administrador> findById(Integer id) {
        return administradorRepository.findById(id);
    }

    public Administrador save(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    public void deleteById(Integer id) {
        administradorRepository.deleteById(id);
    }
}
