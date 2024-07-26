package co.edu.sena.plattea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Carrito")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarrito;

    @ManyToOne
    @JoinColumn(name = "IdClienteFK", nullable = false)
    private Cliente cliente;

    // Getters y Setters

    public Integer getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
