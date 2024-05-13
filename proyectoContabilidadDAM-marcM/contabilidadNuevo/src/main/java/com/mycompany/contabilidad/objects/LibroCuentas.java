package com.mycompany.contabilidad.objects;

import java.util.HashMap;

/**
 *
 * @author alex
 */
public class LibroCuentas {
    
    private String id;
    private HashMap<String, Movimiento> movimientos;
    private int totalMoney;

    public LibroCuentas(String id, int totalMoney) {
        this.id = id;
        this.totalMoney = totalMoney;
        movimientos = new HashMap<>();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HashMap<String, Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(HashMap<String, Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void addMovimiento(Movimiento movimiento) {
        movimientos.put(movimiento.getId(),movimiento);
    }
    
}
