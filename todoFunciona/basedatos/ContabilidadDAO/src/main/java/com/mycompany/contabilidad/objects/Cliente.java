package com.mycompany.contabilidad.objects;

/**
 *
 * @author alex
 */
public class Cliente extends Usuario {
    
    private String subcomercial;

    public Cliente(String subcomercial, String nombreContacto, String id, String address, int telephone, String email) {
        super(nombreContacto, id, address, telephone, email);
        this.subcomercial = subcomercial;
    }

    public String getSubcomercial() {
        return subcomercial;
    }

    public void setSubcomercial(String subcomercial) {
        this.subcomercial = subcomercial;
    }
    
    
    
    
}
