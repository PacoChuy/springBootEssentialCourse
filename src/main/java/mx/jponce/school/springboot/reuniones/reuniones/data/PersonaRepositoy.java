package mx.jponce.school.springboot.reuniones.reuniones.data;

import mx.jponce.school.springboot.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepositoy extends JpaRepository<Persona, Long> {
}
