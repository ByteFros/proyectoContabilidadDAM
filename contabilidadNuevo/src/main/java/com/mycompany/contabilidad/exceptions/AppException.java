package com.mycompany.contabilidad.exceptions;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alex
 */
public class AppException extends Exception {
    
    private static final int CLIENTE_EXISTE = 0;
    private static final int PROVEEDOR_EXISTE = 1;
    private static final int MOVIMIENTO_EXISTE = 2;
    
    private final List<String> mensajes = Arrays.asList (
            "Ya existe un cliente con la ID indicada.",
            "Ya existe un proveedor con la ID indicada.",
            "Ya existe un movimiento con la ID indicada."
    );
    
    private final int code;
    
    public AppException(int code) {
        this.code = code;
    }
    
    @Override
     public String getMessage() {
         return mensajes.get(code);
     }
    
}
