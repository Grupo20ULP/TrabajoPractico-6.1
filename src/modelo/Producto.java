package modelo;

import java.util.Objects;

/**
 *
 * @author Nehuen
 */
public class Producto {

    private String nombre;
    private double precio;
    private Catalogo categoria;

    public Producto (String nombre, double precio, Catalogo categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Producto () {
    }
    

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio () {
        return precio;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    public Catalogo getCategoria () {
        return categoria;
    }

    public void setCategoria (Catalogo categoria) {
        this.categoria = categoria;
    }



    @Override
    public int hashCode () {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash
            = 37 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.
            doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(
            other.precio)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
}
