/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyectocontabilidad1;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Proyectocontabilidad1 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        byte entero = 12;
//
//        System.out.println("numero dado " + entero);
//
//        entero = 100;
//        System.out.println("2do numero dado " + entero);
//
//        float decimal = 3.1416f;
//
//        double decimalMayor = 3.14562345234523453452345;
//
//        System.out.println("numero decimal float dado " + decimal);
//        System.out.println("2do numero decumal double dado " + decimalMayor);
//
//        String caracter = "hola mundo";
//
//        System.out.println(caracter + " adios mundo");
//
//        caracter = "todos digan sockoo";
//
//        System.out.println("hola " + caracter);
//
//        boolean estado = true;
//
//        System.out.println("la decision fue " + estado);
//
//        estado = false;
//
//        System.out.println("la decision ahora fue " + estado);
//
//        Integer nulo;
//        nulo = null;
//
//        System.out.println("el valor de nulo " + nulo);
//
//        String saludar;
//        saludar = "hola";
//
//        System.out.println(saludar);
//
//        final long mil = 1000;
//
//        System.out.println(mil);

        System.out.println("todos digan socko! ! ! ");

        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("ingrese un numero: ");

        numero = input.nextInt();

        System.out.println("el numero ingresado fue " + numero);
        
        float numeroFloat;
        
        System.out.print("Ingresa un numero decimal...");
        numeroFloat = input.nextFloat();
        
        System.out.println("el numero flotante fue " + numeroFloat);
        
        String texto;
        
        System.out.println("todos impriman un texto");
        
        texto = input.next();
        
        System.out.println(texto);
        System.out.println(texto);
        System.out.println(texto);

    }
}