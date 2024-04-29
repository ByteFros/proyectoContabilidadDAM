
package com.mycompany.contabilidad.objects;

import java.util.Date;

/**
 *
 * @author amaia
 */

public class Movimiento {
    
    private String id;
    private Usuario usuario;
    private String cantidad;
    private Date fecha;
    private String concepto;
    private String observaciones;

    public Movimiento(String id, Usuario usuario, String cantidad, Date fecha, String concepto, String observaciones) {
        this.id = id;
        this.usuario = usuario;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.concepto = concepto;
        this.observaciones = observaciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
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
