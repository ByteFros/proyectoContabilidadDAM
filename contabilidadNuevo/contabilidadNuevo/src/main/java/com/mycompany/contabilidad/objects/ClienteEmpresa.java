package com.mycompany.contabilidad.objects;

/**
 *
 * @author alex
 */
public class ClienteEmpresa extends Cliente {
    
    private String nombreEmpresa;

    public ClienteEmpresa(String nombreEmpresa, String subcomercial, String nombreContacto, String id, String address, int telephone, String email) {
        super(subcomercial, nombreContacto, id, address, telephone, email);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
    
}
