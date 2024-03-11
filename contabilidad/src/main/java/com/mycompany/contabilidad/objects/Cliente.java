
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
    private String dni;
    private String email;

    public Cliente(String name, String lastname, String address, int telephone, String dni, String email) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.telephone = telephone;
        this.dni = dni;
        this.email = email;
    }
    
    
}
