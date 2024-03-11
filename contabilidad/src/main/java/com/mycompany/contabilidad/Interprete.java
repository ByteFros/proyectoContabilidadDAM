package com.mycompany.contabilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mfontana
 */
public class Interprete {

    private BufferedReader br;

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
                }
                else {
                    error = false;
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } while (error);
        return string;
    }
    
    public boolean lenComp(String[] argumento, int num) {
        if (argumento.length == num) {
            return true;
        }
        else {return false;}
    }
}
