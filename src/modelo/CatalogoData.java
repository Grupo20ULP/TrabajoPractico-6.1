package modelo;

import java.util.ArrayList;

/**
 *
 * @author Heber Gomez
 */
public class CatalogoData {

    public ArrayList<Catalogo> obtenerCategorias () {
        ArrayList<Catalogo> lista = new ArrayList<>();
        lista.add(new Catalogo("Farmacia", 1));
        lista.add(new Catalogo("Comestibles", 2));
        lista.add(new Catalogo("Perfumeria", 3));
        lista.add(new Catalogo("Ropa", 4));
        lista.add(new Catalogo("Limpieza", 4));
        return lista;
    }
}
