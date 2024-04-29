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
    private HashMap<String,Cliente> clientes;
    private HashMap<String,Proveedor> proveedores;
    
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
    
    public void addCliente(String subcomercial, String nombreContacto, String id, String address, int telephone, String email) throws AppException {
        if (!clientes.containsKey(id)) {
            Cliente cliente = new Cliente(subcomercial, nombreContacto, id, address, telephone, email);
            clientes.put(id, cliente);
        } else {
            throw new AppException(0);
        }
    }
    
    public void addClienteEmpresa(String subcomercial, String nombreContacto, String id, String address, int telephone, String email, String nombreEmpresa) throws AppException {
        if (!clientes.containsKey(id)) {
        ClienteEmpresa cliente = new ClienteEmpresa(nombreEmpresa, subcomercial, nombreContacto, id, address, telephone, email);
        clientes.put(id, cliente);
        } else {
            throw new AppException(0);
        }
    }
    
    public void addProveedor(String nombreEmpresa, String nombreContacto, String id, String address, int telephone, String email) throws AppException {
        if (!proveedores.containsKey(id)) {
        Proveedor proveedor = new Proveedor(nombreEmpresa, nombreContacto, id, address, telephone, email);
        proveedores.put(id,proveedor);
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
