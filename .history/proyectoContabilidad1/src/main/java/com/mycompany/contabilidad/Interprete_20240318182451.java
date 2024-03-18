package com.mycompany.contabilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.mycompany.contabilidad.objects.Cliente;

/**
 *
 * @author amaia
 */
public class Interprete {

    private BufferedReader br;
    public Cliente addCliente;

    public Interprete() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String askString(String message) {
        System.out.println(message);
        String string = "";
        boolean error = true;
        do {
            try {
                string = br.readLine();
                if ("".equals(string)) {
                    System.out.println("El comando no debe estar vacío.");
                } else {
                    error = false;
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } while (error);
        return string;
    }

    public boolean checkArgs(String[] argumentos, int num) {
        if (argumentos.length == num) {
            for (int i = 0; i < argumentos.length; i++) {
                if ("".equals(argumentos[i])) {
                    System.out.println("Alguno de los campos está vacío, revise el comando.");
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean checkLength(String string, int num) {
        if (string.length() == num) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isInt(String string) {
        int num;
        try {
            num = Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        if (num <= 0) {
            return false;
        }
        return true;
    }

    public boolean isDouble(String string) {
        double num;
        try {
            num = Double.parseDouble(string);
        } catch (NumberFormatException ex) {
            return false;
        }
        if (num <= 0) {
            return false;
        }
        return true;
    }

    public int letraDni(String letra) {
        String[] letrasDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        for (int i = 0; i < letrasDni.length; i++) {
            if (letra.equals(letrasDni[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean validarDni(String dni) {
        if (checkLength(dni, 9)) {
            String letraDni = dni.substring(8, 9);
            String numDni = dni.substring(0, 8);
            if (isInt(numDni)) {
                if (Integer.parseInt(numDni) > 0) {
                    int defNumDni = Integer.parseInt(numDni);
                    int resto = defNumDni % 23;
                    int check = letraDni(letraDni);
                    if (resto == check) {
                        return true;
                    } else {
                        System.out.println("La letra del DNI introducido no es correcto.");
                        return false;
                    }
                } else {
                    System.out.println("El número del DNI no puede ser 0.");
                    return false;
                }
            } else {
                System.out.println("El número del DNI no es correcto.");
                return false;
            }
        } else {
            System.out.println("El DNI introducido no es correcto.");
            return false;
        }
    }

    public static boolean checkTel(String tfno) {
        if (tfno.length() == 9) {
            if (isInt(tfno)) {
                return true;
            }
        }
        System.out.println("El teléfono introducido no es correcto.");
        return false;
    }
    
    

}
