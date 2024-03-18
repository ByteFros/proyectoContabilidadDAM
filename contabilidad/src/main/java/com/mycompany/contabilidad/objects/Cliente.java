
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
