
package com.mycompany.contabilidad.objects;

/**
 *
 * @author amaia
 */

public class Usuario {
    
    private String nombreContacto;
    private String id;
    private String address;
    private int telephone;
    private String email;

    public Usuario(String nombreContacto, String id, String address, int telephone, String email) {
        this.nombreContacto = nombreContacto;
        this.id = id;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}
