package co.edu.sena.plattea.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdministrador;

    @Column(name = "AreaAdministrador", nullable = false, length = 20)
    private String areaAdministrador;

    @ManyToOne
    @JoinColumn(name = "IdPersonaFK", nullable = false)
    private Persona persona;

    // Getters y Setters

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getAreaAdministrador() {
        return areaAdministrador;
    }

    public void setAreaAdministrador(String areaAdministrador) {
        this.areaAdministrador = areaAdministrador;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
