package co.unicauca.projectcomposite.entities;

/**
 *
 * @author Jhonfer Ruiz 
 */
public class Pedido extends ProductoCompuesto {
    private String cliente;

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public void addProduct(IPrecio product) {
        super.addProduct(product); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeProducto(IPrecio product) {
        super.removeProducto(product); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void estableceCantidad(IPrecio product,int cantidadFinal){
        if (product instanceof ProductoUnitario) {
            ((ProductoUnitario)super.getProducts().get(super.getProducts().indexOf(product))).setCantidad(cantidadFinal);
        }
    }
    public void establecePeso(IPrecio product,double pesoFinal){
        if (product instanceof ProductoPeso) {
            ((ProductoPeso)super.getProducts().get(super.getProducts().indexOf(product))).setPeso(pesoFinal);
        }
    }
}
