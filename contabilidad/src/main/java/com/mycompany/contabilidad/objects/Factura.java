
package com.mycompany.contabilidad.objects;

/**
 *
 * @author amaia
 */

public class Factura {
    
    private String id;
    private Cliente cliente;
    private boolean payed;
    private double net;
    private double iva;
    private double total;

    public Factura(String id, Cliente cliente, double net) {
        this.id = id;
        this.cliente = cliente;
        this.net = net;
        this.iva = 0.21;
        this.payed = false;
        this.total = net + (net*0.21);
    }
    
    
}
