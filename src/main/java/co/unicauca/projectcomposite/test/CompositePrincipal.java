/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.projectcomposite.test;

import co.unicauca.projectcomposite.entities.Pedido;
import co.unicauca.projectcomposite.entities.ProductoCompuesto;
import co.unicauca.projectcomposite.entities.ProductoPeso;
import co.unicauca.projectcomposite.entities.ProductoUnitario;

/**
 *
 * @author fallen
 */
public class CompositePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido("SEAS - Estudios Abiertos");
        ProductoPeso jamon=new ProductoPeso(5.0, 10.0,"Jamon Iberico", "Embutidos");
        ProductoPeso lomo=new ProductoPeso(0.8, 5.0, "Lomo Iberico", "Embutidos");
        
        ProductoUnitario paqueteEspaguetis=new ProductoUnitario(3, 1500, "Paquete de espaguetis", "Pasta");
        ProductoUnitario vino=new ProductoUnitario(6, 2250, "Botella de vino", "Vinos");
        
        ProductoCompuesto cestaNavidad=new ProductoCompuesto();
        cestaNavidad.addProduct(vino);
        cestaNavidad.addProduct(lomo);
        
        pedido.addProduct(jamon);
        pedido.addProduct(paqueteEspaguetis);
        
        System.out.println("El importe total es: "+pedido.getImporteTotal());
        pedido.addProduct(cestaNavidad);
        System.out.println("El importe total es: "+pedido.getImporteTotal());
        
    }
    
}
