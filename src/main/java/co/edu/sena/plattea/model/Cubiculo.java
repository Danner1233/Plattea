package co.edu.sena.plattea.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Cubiculo")
public class Cubiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCubiculo;

    @Column(name = "NumeroCubiculo", nullable = false)
    private Integer numeroCubiculo;

    @Column(name = "DireccionCubiculo", nullable = false, length = 20)
    private String direccionCubiculo;

    @Column(name = "FechaAperturaCubiculo", nullable = false)
    private Date fechaAperturaCubiculo;

    @Column(name = "NombreCubiculo", nullable = false, length = 20)
    private String nombreCubiculo;

    @Column(name = "CalificacionCubiculo", nullable = false)
    private Integer calificacionCubiculo;

    @Column(name = "EstadoCubiculo", nullable = false)
    private Boolean estadoCubiculo;

    @ManyToOne
    @JoinColumn(name = "IdArrendatarioFK", nullable = false)
    private Arrendatario arrendatario;

    @ManyToOne
    @JoinColumn(name = "IdAdministradorFK", nullable = false)
    private Administrador administrador;

    // Getters y Setters

    public Integer getIdCubiculo() {
        return idCubiculo;
    }

    public void setIdCubiculo(Integer idCubiculo) {
        this.idCubiculo = idCubiculo;
    }

    public Integer getNumeroCubiculo() {
        return numeroCubiculo;
    }

    public void setNumeroCubiculo(Integer numeroCubiculo) {
        this.numeroCubiculo = numeroCubiculo;
    }

    public String getDireccionCubiculo() {
        return direccionCubiculo;
    }

    public void setDireccionCubiculo(String direccionCubiculo) {
        this.direccionCubiculo = direccionCubiculo;
    }

    public Date getFechaAperturaCubiculo() {
        return fechaAperturaCubiculo;
    }

    public void setFechaAperturaCubiculo(Date fechaAperturaCubiculo) {
        this.fechaAperturaCubiculo = fechaAperturaCubiculo;
    }

    public String getNombreCubiculo() {
        return nombreCubiculo;
    }

    public void setNombreCubiculo(String nombreCubiculo) {
        this.nombreCubiculo = nombreCubiculo;
    }

    public Integer getCalificacionCubiculo() {
        return calificacionCubiculo;
    }

    public void setCalificacionCubiculo(Integer calificacionCubiculo) {
        this.calificacionCubiculo = calificacionCubiculo;
    }

    public Boolean getEstadoCubiculo() {
        return estadoCubiculo;
    }

    public void setEstadoCubiculo(Boolean estadoCubiculo) {
        this.estadoCubiculo = estadoCubiculo;
    }

    public Arrendatario getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(Arrendatario arrendatario) {
        this.arrendatario = arrendatario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
