package mx.jponce.school.springboot.reuniones.models;

import jakarta.persistence.*;

@Entity
@Table(name = "asistente")
@IdClass(AsistenteId.class)
public class Asistente {

    @Id
    @Column(name = "reunion_id")
    private Long reunionId;

    @Id
    @Column(name = "persona_id")
    private Long personaId;

    @ManyToOne
    @JoinColumn(name = "reunion_id", insertable = false, updatable = false)
    private Reunion reunion;

    @ManyToOne
    @JoinColumn(name = "persona_id", insertable = false, updatable = false)
    private Persona persona;

    // getters y setters
}
