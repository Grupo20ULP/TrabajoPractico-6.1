package modelo;

import java.util.*;

/**
 *
 * @author Nehuen
 */
public class Catalogo {
    private List<Producto> productos;
    
    public Catalogo(){
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public List<Producto> getProductos(){
        return productos;
    }
    
}
