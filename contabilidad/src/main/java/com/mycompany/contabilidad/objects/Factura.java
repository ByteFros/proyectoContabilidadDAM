
package com.mycompany.contabilidad.objects;

/**
 *
 * @author amaia
 */

public class Factura {
    
    private String id;
    private Cliente cliente;
    private boolean payed;
    private double cost;

   

    public Factura(String id, Cliente cliente, boolean payed, double cost) {
        this.id = id;
        this.cliente = cliente;
        this.payed = payed;
        this.cost = cost;
    }
    
     public Factura(String id, Cliente cliente, double cost) {
        this(id, cliente, false, cost);
    }
    
    
}
