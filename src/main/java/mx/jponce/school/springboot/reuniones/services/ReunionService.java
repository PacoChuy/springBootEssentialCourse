package mx.jponce.school.springboot.reuniones.services;

import mx.jponce.school.springboot.reuniones.models.Reunion;
import mx.jponce.school.springboot.reuniones.reuniones.data.ReunionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReunionService {
    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones() {
        return reunionRepository.findAll();
    }
}

