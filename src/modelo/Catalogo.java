package modelo;

import java.util.*;

/**
 *
 * @author Nehuen
 */
public class Catalogo {

    private String categoria;
    private int idCategoria;

    public Catalogo (String categoria, int idCategoria) {
        this.categoria = categoria;
        this.idCategoria = idCategoria;
    }

    public int getIdCategoria () {
        return idCategoria;
    }

    public void setIdCategoria (int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria () {
        return categoria;
    }

    public void setCategoria (String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode () {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.categoria);
        hash = 83 * hash + this.idCategoria;
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
        final Catalogo other = (Catalogo) obj;
        if (this.idCategoria != other.idCategoria) {
            return false;
        }
        return Objects.equals(this.categoria, other.categoria);
    }

    @Override
    public String toString () {
        return categoria;
    }
}
