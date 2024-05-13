package com.mycompany.contabilidad.objects;

/**
 *
 * @author alex
 */
public class Proveedor extends Usuario {
    
    private String nombreEmpresa;

    public Proveedor(String nombreEmpresa, String nombreContacto, String id, String address, String telephone, String email) {
        super(nombreContacto, id, address, telephone, email);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
       
}
