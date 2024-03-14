package com.mycompany.contabilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                    //case "paybill":
                    //case "pending":
                    //case "payed":
                    //case "anual":
                    //case "help":
                    //default:
                }
            }
        } while (menu == true);
    }
    
}
