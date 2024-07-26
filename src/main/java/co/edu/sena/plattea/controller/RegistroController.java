package co.edu.sena.plattea.controller;

import co.edu.sena.plattea.model.Persona;
import co.edu.sena.plattea.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistroController {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/registro")
    public String registroForm(Model model) {
        return "registro"; // nombre de la vista (archivo HTML)
    }

    @PostMapping("/registro")
    public String registrarUsuario(@RequestParam String username,
                                   @RequestParam String email,
                                   @RequestParam String password,
                                   Model model) {
        // Crear una nueva persona
        Persona persona = new Persona();
        persona.setNombrePersona(username);
        persona.setCorreoPersona(email);
        persona.setContrasenaPersona(password); // Considera encriptar la contraseña
        persona.setEstadoPersona(true); // Suponiendo que el estado es activo
        // Establecer otros atributos según sea necesario

        // Guardar la persona en la base de datos
        personaRepository.save(persona);

        return "redirect:/Login"; // Redirigir a la página de login o a donde desees
    }
}
