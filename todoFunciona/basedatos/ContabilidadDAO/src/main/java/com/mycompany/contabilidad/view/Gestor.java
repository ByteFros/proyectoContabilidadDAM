package com.mycompany.contabilidad.view;

import com.mycompany.contabilidad.exceptions.AppException;
import com.mycompany.contabilidad.objects.Cliente;
import com.mycompany.contabilidad.objects.ClienteEmpresa;
import com.mycompany.contabilidad.objects.Movimiento;
import com.mycompany.contabilidad.objects.Proveedor;
import com.mycompany.contabilidad.objects.Usuario;
import com.mycompany.contabilidad.persistencia.ContabilidadDAO;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 */
public class Gestor {

    private static Gestor instance;
    private ContabilidadDAO cont;

    private Gestor() {
        cont = ContabilidadDAO.getInstance();
    }

    public static Gestor getInstance() {
        if (instance == null) {
            instance = new Gestor();
        }
        return instance;
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

    public int toInt(String string) throws AppException {
        int num;
        try {
            num = Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            throw new AppException(5);
        }
        return num;
    }

    public void checkCharCif(String letra) throws AppException {
        boolean check = false;
        String[] letrasCif = {"R", "W", "A", "G", "F", "P", "D", "B", "N", "S", "Q", "V", "H", "C", "E", "J"};
        for (int i = 0; i < letrasCif.length; i++) {
            if (letra.equals(letrasCif[i])) {
                check = true;
            }
        }
        if (!check) {
            throw new AppException(4);
        }
    }

    public boolean checkNif(String nif) throws AppException {
        if (checkLength(nif, 9)) {
            String letraDni = nif.substring(8, 9);
            String numDni = nif.substring(0, 8);
            int intNumDni = toInt(numDni);
            if (intNumDni > 0) {
                int resto = intNumDni % 23;
                int check = checkCharNif(letraDni);
                if (resto == check) {
                    return true;
                }
            }
        }
        throw new AppException(3);
    }

    public boolean checkCif(String cif) throws AppException {
        if (checkLength(cif, 9)) {
            String letraCif = cif.substring(0, 1);
            checkCharCif(letraCif);
            return true;
        }
        throw new AppException(3);
    }
    
    public void verSaldo() throws SQLException{
        double Saldo = cont.getSaldo();
        JOptionPane.showMessageDialog(null, "El saldo total de la empresa es: " + Saldo + " €" , "Saldo", JOptionPane.INFORMATION_MESSAGE);
    }
   
    public int checkTelephone(String string) throws AppException {
        if (string.length() == 9) {
            int telephone = toInt(string);
            return telephone;
        }
        throw new AppException(6);
    }
    
    public boolean checkEmail(String email) throws AppException {
        String[] partesEmail = email.split("@");
        if (partesEmail.length == 2) {
            if (!partesEmail[0].equals("") && !partesEmail[1].equals("")) {
                String[] dominio = email.split("\\.");
                if (dominio.length == 2) {
                    if (!dominio[0].equals("") && !dominio[1].equals("")) {
                        return true;
                    }
                }
            }
        }
        throw new AppException(7);
    }
    
    public void addCliente(Cliente c) throws AppException, SQLException {
        if (cont.existeCliente(c.getId())) {
            throw new AppException(0);
        }
        cont.insertarCliente(c);
    }

    public void addClienteEmpresa(ClienteEmpresa ce) throws AppException, SQLException {
        if (cont.existeCliente(ce.getId())) {
            throw new AppException(0);
        }
        cont.insertarClienteEmpresa(ce);
        
    }

    public void addProveedor(Proveedor p) throws AppException, SQLException {
        if (cont.existeProveedor(p.getId())) {
            throw new AppException(1);
        }
        cont.insertarProveedor(p);
    }

    public void addMovimiento(Movimiento m) throws AppException, SQLException {
        cont.insertarMovimiento(m);
    }
    
    public Usuario getUser(String nifcif) throws SQLException, AppException {
        Usuario u = null;
        if (cont.existeCliente(nifcif)) {
                if (cont.getClienteEmpresa(nifcif).getNombreEmpresa() != null) {
                u = cont.getClienteEmpresa(nifcif);
                } else {
                    u = cont.getCliente(nifcif);
                }
            }
            else if (cont.existeProveedor(nifcif)) {
                u = cont.getProveedor(nifcif);
            }
        if (u == null) {
            throw new AppException(8);
        }
        return u;
    }
    
    public void checkNifCif(String nifcif) throws AppException {
        try {
            Gestor.getInstance().checkNif(nifcif);
        } catch (AppException ex) {
            try {
                Gestor.getInstance().checkCif(nifcif);
            } catch (AppException e) {
                throw new AppException(8);
            }
        }
    }
    
}