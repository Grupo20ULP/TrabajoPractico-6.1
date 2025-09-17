package modelo;

import java.util.ArrayList;

/**
 *
 * @author Heber Gomez
 */
public class ProductoData {

    public ArrayList<Producto> lista = new ArrayList<>();

    public void guardarProductos (Producto p) {
        lista.add(p);
    }

    public ArrayList<Producto> obtenerProducto () {
        return lista;
    }
}
