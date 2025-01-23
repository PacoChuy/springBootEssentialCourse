package mx.jponce.school.springboot.reuniones.services;

import mx.jponce.school.springboot.reuniones.models.Persona;
import mx.jponce.school.springboot.reuniones.reuniones.data.PersonaRepositoy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    private static final List<Persona> personas = new ArrayList<>();

    private final PersonaRepositoy personaRepositoy;

    public PersonaService(PersonaRepositoy personaRepositoy) {
        this.personaRepositoy = personaRepositoy;
    }

    public List<Persona> getAllPersonas(){
        return personaRepositoy.findAll();
    }
}
