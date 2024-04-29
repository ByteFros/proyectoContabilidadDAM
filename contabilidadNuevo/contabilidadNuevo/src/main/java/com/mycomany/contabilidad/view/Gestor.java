package com.mycomany.contabilidad.view;

import com.mycompany.contabilidad.exceptions.AppException;
import com.mycompany.contabilidad.objects.Cliente;
import com.mycompany.contabilidad.objects.ClienteEmpresa;
import com.mycompany.contabilidad.objects.LibroCuentas;
import com.mycompany.contabilidad.objects.Movimiento;
import com.mycompany.contabilidad.objects.Proveedor;
import com.mycompany.contabilidad.objects.Usuario;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author alex
 */
public class Gestor {

    private static Gestor instance;
    private LibroCuentas libro;
    private HashMap<String, Cliente> clientes;
    private HashMap<String, Proveedor> proveedores;

    private Gestor() {
        this.libro = new LibroCuentas("1", 100000);
        clientes = new HashMap<>();
        proveedores = new HashMap<>();
    }

    public Gestor getInstance() {
        if (this.instance == null) {
            this.instance = new Gestor();
        }
        return this.instance;
    }

    public int checkCharNif(String letra) {
        String[] letrasDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        for (int i = 0; i < letrasDni.length; i++) {
            if (letra.equals(letrasDni[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkLength(String string, int num) {
        if (string.length() == num) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isInt(String string) {
        int num;
        try {
            num = Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        if (num <= 0) {
            return false;
        }
        return true;
    }

    public int checkCharCif(String letra) {
        String[] letrasDni = {"R", "W", "A", "G", "F", "P", "D", "B", "N", "S", "Q", "V", "H", "C", "E", "J"};
        for (int i = 0; i < letrasDni.length; i++) {
            if (letra.equals(letrasDni[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkNif(String nif) throws AppException {
        if (checkLength(nif, 9)) {
            String letraDni = nif.substring(0, 1);
            String numDni = nif.substring(1, 9);
            if (isInt(numDni)) {
                if (Integer.parseInt(numDni) > 0) {
                    int defNumDni = Integer.parseInt(numDni);
                    int resto = defNumDni % 23;
                    int check = checkCharNif(letraDni);
                    if (resto == check) {
                        return true;
                    }
                }
            }
        }
        throw new AppException(3);
    }

    public boolean checkCif(String cif) throws AppException {
        if (checkLength(cif, 9)) {
            String letraCif = cif.substring(8, 9);
            String numCif = cif.substring(0, 8);
            if (isInt(numCif)) {
                if (Integer.parseInt(numCif) > 0) {
                    int defNumDni = Integer.parseInt(numCif);
                    int resto = defNumDni % 23;
                    int check = checkCharCif(letraCif);
                    if (resto == check) {
                        return true;
                    }
                }
            }
        }
        throw new AppException(3);
    }

    public void addCliente(String subcomercial, String nombreContacto, String id, String address, int telephone, String email) throws AppException {
        if (!clientes.containsKey(id)) {
            checkNif(id);
            Cliente cliente = new Cliente(subcomercial, nombreContacto, id, address, telephone, email);
            clientes.put(id, cliente);
        } else {
            throw new AppException(0);
        }
    }

    public void addClienteEmpresa(String subcomercial, String nombreContacto, String id, String address, int telephone, String email, String nombreEmpresa) throws AppException {
        if (!clientes.containsKey(id)) {
            checkCif(id);
            ClienteEmpresa cliente = new ClienteEmpresa(nombreEmpresa, subcomercial, nombreContacto, id, address, telephone, email);
            clientes.put(id, cliente);
        } else {
            throw new AppException(0);
        }
    }

    public void addProveedor(String nombreEmpresa, String nombreContacto, String id, String address, int telephone, String email) throws AppException {
        if (!proveedores.containsKey(id)) {
            checkCif(id);
            Proveedor proveedor = new Proveedor(nombreEmpresa, nombreContacto, id, address, telephone, email);
            proveedores.put(id, proveedor);
        } else {
            throw new AppException(1);
        }
    }

    public void addMovimiento(String id, Usuario usuario, double cantidad, Date fecha, String concepto, String observaciones) throws AppException {
        if (!libro.getMovimientos().containsKey(id)) {
            Movimiento movimiento = new Movimiento(id, usuario, cantidad, fecha, concepto, observaciones);
            libro.addMovimiento(movimiento);
        } else {
            throw new AppException(2);
        }
    }

}
