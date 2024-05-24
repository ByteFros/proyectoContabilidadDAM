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
    private static final int DNI_INCORRECTO = 3;
    private static final int CIF_INCORRECTO = 4;
    private static final int NUM_FORMATO = 5;
    private static final int TELEFONO_INCORRECTO = 6;
    private static final int EMAIL_INCORRECTO = 7;
    private static final int NO_USER = 8;
    
    private final List<String> mensajes = Arrays.asList (
            "Ya existe un cliente con el NIF/CIF indicado.",
            "Ya existe un proveedor con el CIF indicado.",
            "Ya existe un movimiento con la ID indicada.",
            "EL DNI no es correcto.",
            "El CIF no es correcto.",
            "Los números no deben contener letras.",
            "El teléfono introducido no es correcto",
            "El e-mail introducido no es correcto",
            "Ningún NIF/CIF registrado coincide con el introducido."
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
