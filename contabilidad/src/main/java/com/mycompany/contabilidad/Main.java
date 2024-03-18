package com.mycompany.contabilidad;

import com.mycompany.contabilidad.objects.Factura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author amaia
 */
public class Main {

    public static void main(String[] args) {
        Interprete i = new Interprete();
        boolean menu = true;
        do{
            String comando = i.askString("Ingrese el comando:");
            String[] argumentos = comando.split("-");
            if (argumentos.length > 0) {
                switch (argumentos[0].toLowerCase()) {
                    case "addclient":
                        if (i.lenComp(argumentos, 7)) {
                            String name = argumentos[1];
                            
                        }
                    //case "addbill":
                    case "paybill":
                        ArrayList<Factura> nombres = new ArrayList<>();
                        if (i.lenComp(argumentos,2)){
                            String id = argumentos[1];
                            for (Factura facturas : nombres){
                                if(facturas.getId().equals(id)){
                                    facturas.setPayed(true);
                                }
                            }
                            
                    //case "pending":
                    //case "payed":
                    //case "anual":
                    //case "help":
                    //default:
                    }
                }
            }
        } while (menu == true);
    }
    
}
