package com.mycompany.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bienvenido/a, ¿qué desea hacer?");
        String comando = br.readLine();
        String[] argumentos = comando.split("-");
        if (argumentos.length > 0) {
            switch (argumentos[0].toLowerCase()) {
                case "addclient":
                    if (lenComp(argumentos, 7)) {
                        System.out.println("Pepe");
                    }
                //    case "bills":
                //  case "pending":
                //case "payed":
                //case "anual":
            }
        }

    }
    public static boolean lenComp(String[] argumento, int num) {
        if (argumento.length == num) {
            return true;
        }
        else {return false;}
    }
}
