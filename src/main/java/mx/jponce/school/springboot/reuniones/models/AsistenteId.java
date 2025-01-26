package mx.jponce.school.springboot.reuniones.models;

import java.io.Serializable;
import java.util.Objects;

public class AsistenteId implements Serializable {
    private Long reunionId;
    private Long personaId;

    // constructor por defecto
    public AsistenteId() {}

    // constructor con parámetros
    public AsistenteId(Long reunionId, Long personaId) {
        this.reunionId = reunionId;
        this.personaId = personaId;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsistenteId that = (AsistenteId) o;
        return Objects.equals(reunionId, that.reunionId) &&
                Objects.equals(personaId, that.personaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reunionId, personaId);
    }

    // getters y setters
}
