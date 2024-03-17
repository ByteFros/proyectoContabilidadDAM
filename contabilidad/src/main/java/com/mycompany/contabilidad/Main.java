package com.mycompany.contabilidad;

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
                        if (i.checkArgs(argumentos, 7)) {
                            String name = argumentos[1];
                            System.out.println(argumentos[2]);
                        }
                        break;
                    //case "addbill":
                    //case "paybill":
                    //case "pending":
                    //case "payed":
                    //case "anual":
                    //case "help":
                    case "quit":
                        System.out.println("¡Hasta la próxima!");
                        menu = false;
                    default:
                        System.out.println("No se reconoce el comando.");
                        System.out.println("Utilice el comando 'help' para revisar los comandos disponibles.");
                }
            }
        } while (menu == true);
    }
    
}
