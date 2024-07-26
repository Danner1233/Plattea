package co.edu.sena.plattea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Almacena")
public class Almacena {
    @EmbeddedId
    private AlmacenaId id;

    @ManyToOne
    @MapsId("idCarritoFK")
    @JoinColumn(name = "IdCarritoFK", nullable = false)
    private Carrito carrito;

    @ManyToOne
    @MapsId("idProductoFK")
    @JoinColumn(name = "IdProductoFK", nullable = false)
    private Producto producto;

    // Getters y Setters

    public AlmacenaId getId() {
        return id;
    }

    public void setId(AlmacenaId id) {
        this.id = id;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
