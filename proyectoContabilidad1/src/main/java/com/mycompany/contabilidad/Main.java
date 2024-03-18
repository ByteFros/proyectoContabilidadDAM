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
        do {
            String comando = i.askString("Ingrese el comando:");
            String[] argumentos = comando.split("-");
            if (argumentos.length > 0) {
                switch (argumentos[0].toLowerCase()) { // Correct syntax with colon (:)
                    case "addclient":
                        if (i.checkArgs(argumentos, 7)) {
                            String name = argumentos[1];

                        }
                        break;
                    case "addbill":
                        if (i.checkArgs(argumentos, 4)) {
                            String name = argumentos[1];
                        }

                        break;

                    case "paybill":
                        if (i.checkArgs(argumentos, 2)) {
                            String name = argumentos[1];
                        }
                        break;

                    case "pending":
                        if (i.checkArgs(argumentos, 1)) {
                            String name = argumentos[1];
                        }
                        break;

                    case "payed":
                        if (i.checkArgs(argumentos, 1)) {
                            String name = argumentos[1];
                        }
                        break;

                    case "anual":
                        if (i.checkArgs(argumentos, 1)) {
                            String name = argumentos[1];
                        }

                        break;

                    case "help":
                        if (i.checkArgs(argumentos, 1)) {
                            String name = argumentos[1];
                        }
                        break;

                    case "quit":
                        System.out.println("Hasta la proxima!");

                        break;

                    default:
                        System.out.println("No se reconoce el comando.");
                        System.out.println("Utilice el comando 'help' para revisar los comandos disponibles.");
                        break;

                }
            }
        } while (menu == true);
    }

}
