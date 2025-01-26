package mx.jponce.school.springboot.reuniones.controllers;

import mx.jponce.school.springboot.reuniones.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personas")
public class PersonaController {

@Autowired
PersonaService personaService;

    @GetMapping
    public  String getAllReuniones(Model model)
    {
      model.addAttribute("personas", personaService.getAllPersonas());
        return "personas";
    }
}
