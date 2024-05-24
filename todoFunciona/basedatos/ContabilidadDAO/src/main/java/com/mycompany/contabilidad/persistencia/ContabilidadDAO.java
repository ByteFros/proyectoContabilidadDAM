/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabilidad.persistencia;

import com.mycompany.contabilidad.exceptions.AppException;
import com.mycompany.contabilidad.objects.Cliente;
import com.mycompany.contabilidad.objects.ClienteEmpresa;
import com.mycompany.contabilidad.objects.Movimiento;
import com.mycompany.contabilidad.objects.Proveedor;
import com.mycompany.contabilidad.objects.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ContabilidadDAO {
    
    private static ContabilidadDAO instance;
    
    private ContabilidadDAO() {
    }
    
    public static ContabilidadDAO getInstance() {
        if (instance == null) {
            instance = new ContabilidadDAO();
        }
        return instance;
    }
    
    private Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/contabilidad";
        String user = "alex";
        String pass = "";
        Connection c = DriverManager.getConnection(url, user, pass);
        return c;
    }

    private void desconectar(Connection c) throws SQLException {
        c.close();
    }
    
    public void insertarCliente(Cliente cl) throws SQLException, AppException{
        if(existeCliente(cl.getId())){
            throw new AppException(5);
        }
        Connection c = conectar();
        PreparedStatement ps = c.prepareStatement("insert into cliente (nombreContacto,direccion,telefono,email,subcomercial,id) values (?,?,?,?,?,?);");
        ps.setString(1,cl.getNombreContacto());
        ps.setString(2,cl.getAddress());
        ps.setInt(3, cl.getTelephone());
        ps.setString(4,cl.getEmail());
        ps.setString(5,cl.getSubcomercial());
        ps.setString(6,cl.getId());
        ps.executeUpdate();
        ps.close();
        desconectar(c);
    }
    
    public Cliente getCliente(String id) throws SQLException{
        Connection c = conectar();
        Statement st = c.createStatement();
        String query = "select * from cliente where id = '"+ id +"';";
        ResultSet rs = st.executeQuery(query);
        Cliente cliente = null;
        if(rs.next()){
            String nombreContacto = rs.getString("nombreContacto");
            String Address = rs.getString("direccion");
            int telefono = rs.getInt("telefono");
            String email = rs.getString("email");
            String subComercial = rs.getString("subcomercial");
            String dni = rs.getString("id");
            cliente = new Cliente(subComercial,nombreContacto,dni,Address,telefono,email);
        }
        rs.close();
        st.close();
        desconectar(c);
        return cliente;
    }
    
    public boolean existeCliente(String id) throws SQLException{
        Connection c = conectar();
        Statement st = c.createStatement();
        String query = "select * from cliente where id = '"+id+"';";
        ResultSet rs = st.executeQuery(query);
        boolean existe = false;
        if(rs.next()){
            existe = true;
        }
        rs.close();
        st.close();
        desconectar(c);
        return existe;
    }
    
    
    public void insertarClienteEmpresa(ClienteEmpresa ce)throws SQLException,AppException{
        if(existeCliente(ce.getId())){
            throw new AppException(5);
        }
        Connection c = conectar();
        PreparedStatement ps = c.prepareStatement("insert into cliente (nombreContacto,direccion,telefono,email,subcomercial,id,nombreEmpresa) values (?,?,?,?,?,?,?);");
        ps.setString(1,ce.getNombreContacto());
        ps.setString(2,ce.getAddress());
        ps.setInt(3, ce.getTelephone());
        ps.setString(4,ce.getEmail());
        ps.setString(5,ce.getSubcomercial());
        ps.setString(6,ce.getId());
        ps.setString(7,ce.getNombreEmpresa());
        ps.executeUpdate();
        ps.close();
        desconectar(c);
    }
    
    public ClienteEmpresa getClienteEmpresa(String id) throws SQLException{
        Connection c = conectar();
        Statement st = c.createStatement();
        String query = "select * from cliente where id = '"+id+"';";
        ResultSet rs = st.executeQuery(query);
        ClienteEmpresa clienteEmpresa = null;
        if(rs.next()){
            String nombreContacto = rs.getString("nombreContacto");
            String Address = rs.getString("direccion");
            int telefono = rs.getInt("telefono");
            String email = rs.getString("email");
            String subComercial = rs.getString("subcomercial");
            String dni = rs.getString("id");
            String nombreEmpresa = rs.getString("nombreEmpresa");
            clienteEmpresa = new ClienteEmpresa(nombreEmpresa,subComercial,nombreContacto,dni,Address,telefono,email);
        }
        rs.close();
        st.close();
        desconectar(c);
        return clienteEmpresa;
    }
    
    public void insertarProveedor(Proveedor p)throws SQLException,AppException{
    Connection c = conectar();
        PreparedStatement ps = c.prepareStatement("insert into proveedor (nombreContacto,direccion,telefono,email,cif,nombreEmpresa) values (?,?,?,?,?,?);");
        ps.setString(1,p.getNombreContacto());
        ps.setString(2,p.getAddress());
        ps.setInt(3, p.getTelephone());
        ps.setString(4,p.getEmail());
        ps.setString(5,p.getId());
        ps.setString(6,p.getNombreEmpresa());
        ps.executeUpdate();
        ps.close();
        desconectar(c);
    }
    
    public Proveedor getProveedor(String id) throws SQLException{
        Connection c = conectar();
        Statement st = c.createStatement();
        String query = "select * from proveedor where cif = '"+id+"';";
        ResultSet rs = st.executeQuery(query);
        Proveedor proveedor = null;
        if (rs.next()){
            String nombreEmpresa = rs.getString("nombreEmpresa");
            String nombreContacto = rs.getString("nombreContacto");
            String address = rs.getString("direccion");
            int telefono = rs.getInt("telefono");
            String email = rs.getString("email");
            String cif = rs.getString("cif");
            proveedor = new Proveedor(nombreEmpresa,nombreContacto,cif,address,telefono,email);
        }
        rs.close();
        st.close();
        desconectar(c);
        return proveedor;
    }
    
    public boolean existeProveedor(String id) throws SQLException{
        Connection c = conectar();
        Statement st = c.createStatement();
        String query = "select * from proveedor where cif = '"+id+"';";
        ResultSet rs = st.executeQuery(query);
        boolean existe = false;
        if(rs.next()){
            existe = true;
        }
        rs.close();
        st.close();
        desconectar(c);
        return existe;
    }
    
    public void insertarMovimiento(Movimiento m) throws SQLException,AppException{
        Connection c = conectar();
        PreparedStatement ps = c.prepareStatement("insert into movimiento (usuario,cantidad,fecha,concepto,observaciones) values (?,?,?,?,?)");
        ps.setString(1,m.getUsuario().getId());
        ps.setDouble(2,m.getCantidad());
        ps.setDate(3, m.getFecha());
        ps.setString(4,m.getConcepto());
        ps.setString(5, m.getObservaciones());
        ps.executeUpdate();
        ps.close();
        desconectar(c);
    }
    
//    public Movimiento getMovimiento(String con) throws SQLException{
//        Connection c = conectar();
//        Statement st = c.createStatement();
//        String query = "select * from movimiento where concepto = '"+con+"';";
//        ResultSet rs = st.executeQuery(query);
//        Movimiento movimiento = null;
//        if(rs.next()){
//            String nombreUsuario =rs.getString("nombreUsuario");
//            int cantidad =rs.getInt("cantidad");
//            Date fecha = rs.getDate("fecha");
//            String concepto =rs.getString("concepto");
//            String observaciones = rs.getString("observaciones");
//            movimiento = new Movimiento(nombreUsuario,cantidad,fecha,concepto,observaciones);
//        }
//        rs.close();
//        st.close();
//        desconectar(c);
//        return movimiento;
//    }
    
    public boolean existeMovimiento(String con) throws SQLException{
        Connection c = conectar();
        Statement st = c.createStatement();
        String query = "select * from movimiento where concepto = '"+con+"';";
        ResultSet rs = st.executeQuery(query);
        boolean existe = false;
        if(rs.next()){
            existe = true;
        }
        rs.close();
        st.close();
        desconectar(c);
        return existe;
    }
    
    public ArrayList<Movimiento> allMovimientos() throws SQLException {
        Connection c = conectar();
        ArrayList<Movimiento> movimientos = new ArrayList<>();
        String query = "select * from movimiento;";
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            String nifcif =rs.getString("usuario");
            Usuario user = null;
            if (existeCliente(nifcif)) {
                if (getClienteEmpresa(nifcif).getNombreEmpresa() != null) {
                user = getClienteEmpresa(nifcif);
                } else {
                    user = getCliente(nifcif);
                }
            }
            else if (existeProveedor(nifcif)) {
                user = getProveedor(nifcif);
            }
            double cantidad =rs.getDouble("cantidad");
            Date fecha = rs.getDate("fecha");
            String concepto =rs.getString("concepto");
            String observaciones = rs.getString("observaciones");
            Movimiento movimiento = new Movimiento(user,cantidad,fecha,concepto,observaciones);
            movimientos.add(movimiento);
        }
        rs.close();
        st.close();
        desconectar(c);
        return movimientos;
    }
    
    public double getSaldo() throws SQLException {
        double saldo = 0;
        ArrayList<Movimiento> movs = allMovimientos();
        for (Movimiento m: movs) {
            double cantidad = m.getCantidad();
            saldo += cantidad;
        }
        return saldo;
    }
}
