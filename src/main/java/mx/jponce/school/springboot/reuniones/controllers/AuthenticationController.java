package mx.jponce.school.springboot.reuniones.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
