package mx.jponce.school.springboot.reuniones.services;

import mx.jponce.school.springboot.reuniones.models.Persona;
import mx.jponce.school.springboot.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReunionService {

    private static final List<Reunion> reuniones = new ArrayList<>();

    static {
        for(int i = 1; i <5; i++) {
            Reunion reunion = new Reunion(i, "Reunión " + i,
                    ZonedDateTime.now().plusDays(i));
            for(int j = 0; j < i; j++) {
                reunion.addAsistente(
                        new Persona(i+j, "Nombre"+ i+ j, "Apellido"+ i+ j));
            }
            reuniones.add(reunion);

        }
    }

    public List<Reunion> getAllReuniones() {
        return reuniones;
    }
}
