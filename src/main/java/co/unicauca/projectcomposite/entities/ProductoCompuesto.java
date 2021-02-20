package co.unicauca.projectcomposite.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonfer Ruiz 
 */
public class ProductoCompuesto implements IPrecio{
    private List<IPrecio> productos;

    public ProductoCompuesto() {
        productos=new ArrayList<>();
    }
    
    public void addProduct(IPrecio precio){
        productos.add(precio);
    }
    
    public void removeProducto(IPrecio precio){
        productos.remove(precio);
    }
    
    public List<IPrecio> getProducts(){
        return productos;
    }

    @Override
    public double getImporteTotal() {
        double importeTotal=0;
        for (IPrecio producto : productos) {
            importeTotal+=producto.getImporteTotal();
        }
        return importeTotal;
    }
    
}
