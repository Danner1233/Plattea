package co.edu.sena.plattea.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Arrendatario")
public class Arrendatario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArrendatario;

    @Column(name = "FechaInicioArrendatario", nullable = false)
    private Date fechaInicioArrendatario;

    @ManyToOne
    @JoinColumn(name = "IdPersonaFK", nullable = false)
    private Persona persona;

    // Getters y Setters

    public Integer getIdArrendatario() {
        return idArrendatario;
    }

    public void setIdArrendatario(Integer idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    public Date getFechaInicioArrendatario() {
        return fechaInicioArrendatario;
    }

    public void setFechaInicioArrendatario(Date fechaInicioArrendatario) {
        this.fechaInicioArrendatario = fechaInicioArrendatario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
