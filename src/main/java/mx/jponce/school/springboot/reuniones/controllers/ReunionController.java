package mx.jponce.school.springboot.reuniones.controllers;

import mx.jponce.school.springboot.reuniones.services.ReunionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reuniones")
public class ReunionController {

    private final ReunionService reunionService;

    // Constructor injection es mejor práctica que @Autowired
    public ReunionController(ReunionService reunionService) {
        this.reunionService = reunionService;
    }

    @GetMapping
    public String getAllReuniones(Model model) {
        model.addAttribute("reuniones", reunionService.getAllReuniones());
        model.addAttribute("titulo", "Listado de Reuniones"); // Agregamos título para la vista
        return "reuniones";
    }
}
