
package com.mycompany.contabilidad.objects;

import java.util.Date;

/**
 *
 * @author amaia
 */

public class Movimiento {
    
    private String nifCif;
    private Usuario usuario;
    private double cantidad;
    private Date fecha;
    private String concepto;
    private String observaciones;

    public Movimiento(String id, Usuario usuario, double cantidad, Date fecha, String concepto, String observaciones) {
        this.nifCif = id;
        this.usuario = usuario;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.concepto = concepto;
        this.observaciones = observaciones;
    }

    public String getId() {
        return nifCif;
    }

    public void setId(String id) {
        this.nifCif = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

   
    
    
    
}
