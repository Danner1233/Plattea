package co.edu.sena.plattea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    private String nombrePersona;
    private String apellidoPersona;
    private String correoPersona;
    private String contrasenaPersona;
    private boolean estadoPersona;
    private int telefonoPersona;

    // Getters y Setters


    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getContrasenaPersona() {
        return contrasenaPersona;
    }

    public void setContrasenaPersona(String contrasenaPersona) {
        this.contrasenaPersona = contrasenaPersona;
    }

    public boolean isEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(boolean estadoPersona) {
        this.estadoPersona = estadoPersona;
    }

    public int getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }
}
