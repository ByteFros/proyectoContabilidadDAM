package com.mycompany.contabilidad.objects;

import com.mycompany.contabilidad.objects.Cliente;

/**
 *
 * @author amaia
 */
public class Factura {

    private String id;
    private Cliente cliente;
    private boolean payed;
    private double bruto;

    public Factura(String id, Cliente cliente, double bruto) {
        this.id = id;
        this.cliente = cliente;
        this.bruto = bruto;
        this.payed = false;

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

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double net) {
        this.bruto = net;
    }

    public void paybill(boolean payed) {
        this.payed = true;
    }
}
