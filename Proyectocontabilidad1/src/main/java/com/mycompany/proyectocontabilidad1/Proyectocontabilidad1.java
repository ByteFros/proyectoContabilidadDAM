/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.proyectocontabilidad1;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
//
//        System.out.println("todos digan socko! ! ! ");
//
//        Scanner input = new Scanner(System.in);
//
//        int numero;
//
//        System.out.print("ingrese un numero: ");
//
//        numero = input.nextInt();
//
//        System.out.println("el numero ingresado fue " + numero);
//        
//        float numeroFloat;
//        
//        System.out.print("Ingresa un numero decimal...");
//        numeroFloat = input.nextFloat();
//        
//        System.out.println("el numero flotante fue " + numeroFloat);
//        
//        String texto;
//        
//        System.out.println("todos impriman un texto");
//        
//        texto = input.nextLine();
//        
//        System.out.println(texto);
//        System.out.println(texto);
//        System.out.println(texto);
//
//        String cadena;
//        int entero;
//        char letra;
//        double decimal;
//
//        cadena = JOptionPane.showInputDialog("digite una cadena...");
//
//        System.out.println("Cadena ingresada: " + cadena);
//        entero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero entero"));
//        System.out.println("Numero introducido: " + entero);
//        letra = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
//        System.out.println("Caracter introducido: " + letra);
//        decimal = Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero decimal:"));
//        System.out.println("el numero decimal ingresado fue: " + decimal);

//          Scanner entrada = new Scanner(System.in);
//          
//          float num1,num2,suma,resta,multiplicacion,division;
//          
//          System.out.println("Por favor ingresa 2 numeros");
//          
//          num1 = entrada.nextFloat();
//          num2 = entrada.nextFloat();
//          
//          suma = num1+num2;
//          resta = num1-num2;
//          multiplicacion = num1*num2;
//          division = num1/num2;
//          
//          System.out.println("la suma entre " + num1 + "y " + num2 + "es... " + suma);
//          System.out.println("la resta entre " + num1 + "y " + num2 + "es... " + resta);
//          System.out.println("la multiplicacion entre " + num1 + "y " + num2 + "es... " + multiplicacion);
//          System.out.println("la division 4bbentre " + num1 + "y " + num2 + "es... " + division);
//            System.out.println("todos digan sockoo!!!");
//            System.out.println("crea un programa que tome la nota de un alumno y te de la media de su nota");
//            
//            Scanner entrada = new Scanner(System.in);
//            
//            System.out.println("crea un programa que calcule y muestre el salario semanal de un empleado"
//                    + "a partir de sus horas semanales trabajadas y de su salario por hora");
//            
//            int semana = 7, horas, paga,dia,salario,horasTrabajadas;
//            
//            
//            System.out.print("ingrese el pago por hora que recibe ");
//            paga = entrada.nextInt();
//            
//            System.out.print("ingrese las horas trabajadas por dia ");
//            horas = entrada.nextInt();
//            
//            dia = paga * horas;
//            
//            salario = dia * semana;
//            
//            horasTrabajadas = horas * semana;
//            
//            
//            System.out.println("\nEl sueldo semanal del trabajador es de " + salario + "€");
//            
//            System.out.println("\nEl trabajador ha trabajado " + horasTrabajadas + " horas en la semana");
//              
//              System.out.println("Crea un programa que evalue la cantidad de dinero que tenga la gente"
//                      + "luis tiene N dolares, juan tiene la mitad de lo que lleva luis"
//                      + "y jose tiene la mitad de lo que llevan luis y juan juntos calcula el total de dinero "
//                      + "que tienen entre los 3");
//              
//              double luis,juan,jose, total;
//              
//              System.out.print("ingresa la cantidad de dinero de luis ");
//              luis = entrada.nextDouble();
//              juan = luis/2;
//              jose = (luis+juan)/2;
//              total = luis + juan + jose;
//              System.out.println("el dinero que tiene luis es de " + luis + "€");
//              System.out.println("el dinero que tiene juan es de " + juan + "€");
//              System.out.println("el dinero que tiene jose es de " + jose + "€");
//              System.out.println("el dinero que tienen entre todos suma " + total + "€");
//              System.out.println("una compañia paga a su personal un salario de 1000 € mensuales mas una comision de 150€ por cada coche vendido"
//                      + "mas el 5% del valor del coche, los registros se dan al final de cada mes crea un programa que realice el calculo"
//                      + "el salario total de un vendedor dado");
//              
        Scanner entrada = new Scanner(System.in);
//              
//              int salario = 1000, comision = 150,coche,total;
//              double porcentaje;
//              System.out.println("ingresa el valor del coche vendido");
//              
//              coche = entrada.nextInt();
//
//              porcentaje = (5.0/100)*coche;
//              
//              total = salario + comision + (int)porcentaje;
//              
//              System.out.println("el salario total mensual del vendedor fue de " + total + "€");
//
//              System.out.println("la calificacion final de un estudiante se calcula en base a las calificaciones de 4 aspectos de su rendimiento"
//                      + "academico que son: participacion(10%) 1er examen(25%) 2do examen(25%) y examen final(40%), estas estan ponderadas segun el porcentaje indicado"
//                      + "anteriormente haz un programa que calcule la nota final obtenida por el estudiante");
//                
//              double participacion, examen1,examen2,examenF,total;
//                
//                System.out.print("\npor favor ingrese la nota de participacion del estudiante ");
//                participacion = entrada.nextDouble();
//                System.out.println("nota ingresada de participacion: " + participacion);
//                
//                
//                System.out.print("por favor ingrese la nota del primer examen del estudiante ");
//                examen1 = entrada.nextDouble();
//                System.out.println("Nota del primer examen: " + examen1);
//                
//                System.out.print("\npor favor ingrese la nota del 2do examen del estudiante ");
//                examen2 = entrada.nextDouble();
//                System.out.print("Nota del segundo examen: " + examen2);
//                
//                System.out.print("\npor favor ingrese la nota del examen final del estudiante ");
//                examenF = entrada.nextDouble();
//                System.out.println("Nota del examen final: " + examenF);
//                
//                participacion *= 0.10;
//                examen1 *= 0.25;
//                examen2 *= 0.25;
//                examenF *= 0.40;
//                
//                total = participacion + examen1 + examen2 + examenF;
//                
//                
//                
//                System.out.println("la nota final del estudiante es de..." + total);

//            System.out.println("todos digan sockoo! ! !");
//            System.out.println("Crea un programa que realice la siguiente operacion matematica: a**2 + b**2 = a**2 + 2*(a+b)+b**2");
//            
//            
//            int num1,num2,resultado;
//            
//            System.out.print("ingresa los numeros para realizar el cuadrado de un binomio: ");
//            num1 = entrada.nextInt();
//            num2 = entrada.nextInt();
//            
//            resultado = (num1+num2) * (num1+num2);
//            
//            System.out.println("el resultado del cuadrado del binomio de: " + num1 + "y" + num2 + " es " + "\n\n" + resultado);
//            
//            System.out.println("Sockooo ! ! !");
//            System.out.println("Crea un programa que dadas las horas ingresadas por el usuario nos muestre, las semanas, dias y horas que no completan"
//                    + "los dias");
//            
//            int semana,dia,horas,horasTotales;
//            
//            System.out.print("Por favor ingrese las horas a para calcular ");
//            horasTotales = entrada.nextInt();
//            
//            semana = horasTotales / 168;
//            dia = horasTotales%168 /24;
//            horas = horasTotales%24;
//            
//            System.out.println("el tiempo transcurrido fue de:\n");
//            System.out.println(semana + " semanas");
//            System.out.println(dia + " dias");
//            System.out.println(horas + " horas");
//            
//            System.out.println("Crea un programa que calcule y muestre por pantalla las raices de una"
//                    + "ecuacion de 2do grado de coeficientes reales");
//        System.out.println("Condicionales ! ! !");
//
//        int numero, dato;
//
//        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
//        dato = 5;
//
//        if (numero == dato) {
//
//            JOptionPane.showMessageDialog(null, "si es igual");
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "no es igual");
//        }

        System.out.println("Uso de switch Case ! ! !");
        

    }
}
