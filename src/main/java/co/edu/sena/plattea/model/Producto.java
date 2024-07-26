package co.edu.sena.plattea.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @Column(name = "NombreProducto", nullable = false, length = 20)
    private String nombreProducto;

    @Column(name = "descripcionProducto", nullable = false, length = 50)
    private String descripcionProducto;

    @ManyToOne
    @JoinColumn(name = "IdCubiculoFK", nullable = false)
    private Cubiculo cubiculo;

    // Getters y Setters

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Cubiculo getCubiculo() {
        return cubiculo;
    }

    public void setCubiculo(Cubiculo cubiculo) {
        this.cubiculo = cubiculo;
    }
}
