package com.mycompany.contabilidad.persistencia;

import com.mycompany.contabilidad.objects.Cliente;
import com.mycompany.contabilidad.objects.Factura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author amaia
 */

public class Fichero {
    
    private String folder;
    private String fileClientes;
    private String fileFacturas;
    private String pathClientes;
    private String pathFacturas;
    private File folderFile;
    
    public Fichero() {
        folder = "dades";
        fileClientes = "clientes.txt";
        fileFacturas = "facturas.txt";
        pathClientes = folder + File.separator + fileClientes;
        pathFacturas = folder + File.separator + fileFacturas;
        folderFile = new File(folder);
    }
    
    public void writeCliente(Cliente c) {
        if (!folderFile.exists()) {
            folderFile.mkdir();
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathClientes, true));
            bw.write(c.toString());
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void writeFactura(Factura f) {
        if (!folderFile.exists()) {
            folderFile.mkdir();
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathFacturas, true));
            bw.write(f.toString());
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ArrayList<Cliente> readClientes() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        if (!folderFile.exists()) {
            return clientes;
        }
        else {
            File f = new File(pathClientes);
            if(!f.exists()) {
                return clientes;
            }
            else {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] datos = line.split("-");
                        String name = datos[0];
                        String lastName = datos[1];
                        String address = datos[2];
                        int telephone = Integer.parseInt(datos[3]);
                        String nif = datos[4];
                        String email = datos[5];
                        Cliente cliente = new Cliente(name, lastName, address, telephone, nif, email);
                        clientes.add(cliente);
                    }
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                return clientes;
            }
        }
    }
    
    public ArrayList<Factura> readFacturas() {
        ArrayList<Factura> facturas = new ArrayList<>();
        ArrayList<Cliente> clientes = readClientes();
        if (!folderFile.exists()) {
            return facturas;
        }
        else {
            File f = new File(pathFacturas);
            if(!f.exists()) {
                return facturas;
            }
            else {
                try {
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] datos = line.split("-");
                        String id = datos[0];
                        String nifCliente = datos[1];
                        boolean payed = Boolean.parseBoolean(datos[2]);
                        double cost = Double.parseDouble(datos[3]);
                        for (Cliente cliente : clientes) {
                            if (nifCliente.equals(cliente.getNif())) {
                                String name = cliente.getName();
                                String lastName = cliente.getLastname();
                                String address = cliente.getAddress();
                                int telephone = cliente.getTelephone();
                                String nif = cliente.getNif();
                                String email = cliente.getEmail();                                
                            }
                        }
                        Cliente cl = new Cliente(name, lastName, address, telephone, nif, email);
                        Factura factura = new Factura(id, cl, payed, cost);
                        facturas.add(factura);
                    }
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                return clientes;
            }
        }
    }

}
