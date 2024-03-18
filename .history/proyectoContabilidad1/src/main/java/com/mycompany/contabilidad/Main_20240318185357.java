package com.mycompany.contabilidad;

import com.mycompany.contabilidad.objects.Cliente;
import com.mycompany.contabilidad.objects.Factura;
import com.mycompany.contabilidad.persistencia.Fichero;
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
        Fichero f = new Fichero();
        
        ArrayList<Cliente> clientes = f.readClientes();
        ArrayList<Factura> facturas = f.readFacturas();
        
        boolean menu = true;
        do {
            String comando = i.askString("Ingrese el comando:");
            String[] argumentos = comando.split("-");
            if (argumentos.length > 0) {
                switch (argumentos[0]) { // Correct syntax with colon (:)
                    case "ADDCLIENT":
                        if (i.checkArgs(argumentos, 7)) {
                            String name = argumentos[1];

                        }
                        break;
                    case "ADDBILL":
                        if (i.checkArgs(argumentos, 4)) {
                            if (!clientes.isEmpty()) {
                                if (i.validarDni(argumentos[2])) {
                                    String id = argumentos[1];
                                    String dni = argumentos[2];
                                    Cliente cliente = i.getCliente(dni, clientes);
                                    if (i.isDouble(argumentos[3])) {
                                        Double coste = Double.parseDouble(argumentos[3]);
                                        Factura factura = new Factura(id, cliente, coste);
                                        facturas.add(factura);
                                        f.writeFactura(factura);
                                        System.out.println("La factura " + id + " se ha registrado correctamente.");

                                    } else {
                                        System.out.println("El coste debe de ser un número.");
                                    }
                                }
                            } else {
                                System.out.println("No hay clientes registrados.");
                            }
                        } else {
                            System.out.println("El número de parámetros no es correcto.");
                        }
                        break;

                    case "PAYBILL":
                        if (i.checkArgs(argumentos,2)){
                            if (!facturas.isEmpty()) {
                                String id = argumentos[1];
                                for (Factura factura : facturas){
                                    if(factura.getId().equals(id)){
                                        factura.setPayed(true);
                                        System.out.println("La factura ha sido pagada correctamente.");                           
                                    } else {
                                        System.out.println("No existe ninguna factura con el ID proporcionado.");
                                    }
                                }
                            } else {
                                System.out.println("No existen facturas registradas.");
                            }
                        } else {
                            System.out.println("El número de parámetros no es correcto.");
                        }
                        break;
                    case "PENDING":
                        if (i.checkArgs(argumentos, 1)) {
                            if (!facturas.isEmpty()) {
                                int contador = 0;
                                for (Factura factura : facturas) {
                                    if (!factura.isPayed()) {
                                        contador++;
                                        System.out.println("Factura: " + factura.getId() + "\tCoste neto: " + factura.getNet());
                                    }
                                } if (contador > 0) {
                                    System.out.println("No existen facturas sin pagar.");
                                }
                            } else {
                                System.out.println("No hay facturas registradas.");
                            }
                        } else {
                            System.out.println("El número de parámetros no es correcto.");
                        }
                        break;

                    case "PAYED":
                        if (i.checkArgs(argumentos, 1)) {
                            if (!facturas.isEmpty()) {
                                int contador = 0;
                                for (Factura factura : facturas) {
                                    if (factura.isPayed()) {
                                        contador++;
                                        System.out.println("Factura: " + factura.getId() + "\tCoste neto: " + factura.getNet());
                                    }
                                } if (contador > 0) {
                                    System.out.println("No existen facturas pagadas.");
                                }
                            } else {
                                System.out.println("No hay facturas registradas.");
                            }
                        } else {
                            System.out.println("El número de parámetros no es correcto.");
                        }
                        break;

//                    case "HELP":
  //                      if (i.checkArgs(argumentos, 1)) {
    //                        System.out.println("");
      //                  }
        //                break;

                    case "QUIT":
                        if (i.checkArgs(argumentos, 1)) {
                            System.out.println("Hasta la proxima!");
                            menu = false;
                        } else {
                            System.out.println("El número de parámetros no es correcto.");
                        }
                        break;

                    default:
                        System.out.println("No se reconoce el comando.");
                        //System.out.println("Utilice el comando 'help' para revisar los comandos disponibles.");
                        break;

                }
            }
        } while (menu == true);
    }

}
