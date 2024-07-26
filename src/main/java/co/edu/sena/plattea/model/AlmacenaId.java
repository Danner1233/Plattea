package co.edu.sena.plattea.model;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlmacenaId implements Serializable {
    private Integer idCarritoFK;
    private Integer idProductoFK;

    // Getters y Setters

    public Integer getIdCarritoFK() {
        return idCarritoFK;
    }

    public void setIdCarritoFK(Integer idCarritoFK) {
        this.idCarritoFK = idCarritoFK;
    }

    public Integer getIdProductoFK() {
        return idProductoFK;
    }

    public void setIdProductoFK(Integer idProductoFK) {
        this.idProductoFK = idProductoFK;
    }

    // hashCode y equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlmacenaId that = (AlmacenaId) o;
        return Objects.equals(idCarritoFK, that.idCarritoFK) && Objects.equals(idProductoFK, that.idProductoFK);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarritoFK, idProductoFK);
    }
}
