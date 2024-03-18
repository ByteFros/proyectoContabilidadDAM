package com.mycompany.contabilidad;

import com.mycompany.contabilidad.objects.Cliente;
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
                            String apellido = argumentos[2];
                            String direccion = argumentos[3];
                            String telephone = argumentos[4];
                            String nif = argumentos[5];
                            String email = argumentos[6];
                            if (Interprete.checkTel(telephone)) {
                                int tel = Integer.parseInt(telephone);
                                if (i.validarDni(nif)) {
                                    Cliente Cliente1 = new Cliente(name, apellido, direccion, tel, nif, email);
                                    i.addCliente = Cliente1;

                                }
                            }

                        }
                        break;
                    case "addbill":
                        if (i.checkArgs(argumentos, 4)) {
                            String name = argumentos[1];
                            String concepto = argumentos[2];
                            double importe = argumentos[3];
                            if (i.validarImporte(importe)) {
                                if (i.validarCliente(name)) {
                                    i.addCliente.addFactura(concepto, importe);
                                }
                            }
                            
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
