/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */import java.util.Scanner
package com.mycompany.Mavenproject2;

/**
 *
 * @author alex7
 */
public class Mavenproject2 {

    public static boolean telefono(String tfno) {
        if (tfno.length() == 9) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean dni(String dni) {
        if (dni.length() == 9) {

            if (dni.substring(0, 7) == ("[0,1,2,3,4,5,6,7,8,9]")) {
                if (dni.substring(8) == ("[A,B,C,D,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,V,X,Y,Z]")) {
                    return true;

                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return false;
    }
    public static boolean email(String email){
        
        if (email.contains("@") ){
             String[] parte=email.split("@");
        
            if (parte.length==2){
                if (parte[1].contains(".")){
                return true;
            }
                else {
                    return false;
                
                
                }
        
                public static boolean nombreExiste(String nombreArchivo,String nombreFactura,String NumeroFactura){

                        Scanner scanner= new Scanner(new File(nombreArchivo));
                        String linea=scanner.nextline();
                        if(linea.contains(nombreFactura)) and linea.contains(numeroFactura)){
                            scanner.close();
                            return True
                        }
                    }
                return false

                }
            public static convertidorInteger(String datos){
                int datoConvertido=Integer.parseInt(datos);
            }

            public static  convertidorDouble(String datos){
                double datoConvertidoDouble=Double.parseDouble(datos);
            }


    }





