
package com.mycompany.contabilidad.objects;

/**
 *
 * @author amaia
 */

public
 class Factura {
    
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
