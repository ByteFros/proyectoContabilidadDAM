
package com.mycompany.contabilidad.objects;

/**
 *
 * @author amaia
 */

public class Cliente {
    
    private String name;
    private String lastname;
    private String address;
    private int telephone;
    private String nif;
    private String email;

    public Cliente(String name, String lastname, String address, int telephone, String nif, String email) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.telephone = telephone;
        this.nif = nif;
        this.email = email;
    }

    public String getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    
    
}
