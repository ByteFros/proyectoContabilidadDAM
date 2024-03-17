
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

    public Factura(String id, Cliente cliente, double cost) {
        this.id = id;
        this.cliente = cliente;
        this.cost = cost;
        this.payed = false;
    }
    
    
}
