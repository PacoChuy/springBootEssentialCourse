package mx.jponce.school.springboot.reuniones.reuniones.data;

import mx.jponce.school.springboot.reuniones.models.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReunionRepository extends JpaRepository<Reunion, Long> {
}
