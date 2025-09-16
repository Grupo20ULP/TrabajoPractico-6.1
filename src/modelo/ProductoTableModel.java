package modelo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ProductoTableModel extends AbstractTableModel {

    private final String[] columnas = {"Nombre", "Categoría", "Precio"};
    private List<Producto> productos;

    public ProductoTableModel(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p = productos.get(rowIndex);
        switch (columnIndex) {
            case 0: return p.getNombre();
            case 1: return p.getPrecio();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
        fireTableDataChanged();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        fireTableDataChanged();
}
}
