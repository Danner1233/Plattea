package co.edu.sena.plattea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/AdministradorArrendatario")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "AdministradorArrendatario";  // Retorna el nombre de la plantilla (index.html)
    }
}
