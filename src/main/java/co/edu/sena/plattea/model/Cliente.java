package co.edu.sena.plattea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(name = "numeroTarjetaCliente", nullable = false, length = 16)
    private String numeroTarjetaCliente;

    @Column(name = "DireccionCliente", nullable = false, length = 30)
    private String direccionCliente;

    @Column(name = "CiudadCliente", nullable = false, length = 30)
    private String ciudadCliente;

    @ManyToOne
    @JoinColumn(name = "IdPersonaFK", nullable = false)
    private Persona persona;

    // Getters y Setters

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumeroTarjetaCliente() {
        return numeroTarjetaCliente;
    }

    public void setNumeroTarjetaCliente(String numeroTarjetaCliente) {
        this.numeroTarjetaCliente = numeroTarjetaCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
