package co.edu.sena.plattea.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;

    @Column(name = "FechaHoraCompra", nullable = false)
    private Date fechaHoraCompra;

    @Column(name = "TotalCompra", nullable = false)
    private Integer totalCompra;

    @Column(name = "EntregaCompra", nullable = false)
    private Boolean entregaCompra;

    @ManyToOne
    @JoinColumn(name = "IdCarritoFK", nullable = false)
    private Carrito carrito;

    // Getters y Setters

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFechaHoraCompra() {
        return fechaHoraCompra;
    }

    public void setFechaHoraCompra(Date fechaHoraCompra) {
        this.fechaHoraCompra = fechaHoraCompra;
    }

    public Integer getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Integer totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Boolean getEntregaCompra() {
        return entregaCompra;
    }

    public void setEntregaCompra(Boolean entregaCompra) {
        this.entregaCompra = entregaCompra;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
