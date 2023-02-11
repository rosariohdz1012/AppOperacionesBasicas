package com.rosario.calculadora;

import javax.swing.*;
import java.text.DecimalFormat;

public class OperacionesBasicas {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //DECLARACION DE VARIABLES
        float cantidad1=0;
        float cantidad2=0;
        String formatoSalida = " " ;
        DecimalFormat decimalFormato=new DecimalFormat("#.##");
        int opMenu=0;
        String menu = """
                Operaciones básicas
                	    Selecciona alguna acción
                	    1.Digitar los valores
                	    2.Suma
                	    3.Diferencia
                	    4.Producto
                        5.Modulo
                        6.Cociente
                        7.Salir
                                
                """;
        //PROCESO
        while (opMenu!=7){

            opMenu = Integer.parseInt(JOptionPane.showInputDialog(null,
                    menu,"Caluladora",JOptionPane.INFORMATION_MESSAGE));

            switch (opMenu){
                case 1:
                    cantidad1= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer valor"));
                    cantidad2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digita el segundo valor"));
                    if (cantidad1>=0 && cantidad2>=0)

                        JOptionPane.showMessageDialog(null,"Ahora puede seleccionar la operacion a realizar",
                                "Informacion Importante",JOptionPane.INFORMATION_MESSAGE);
                    else

                       JOptionPane.showMessageDialog(null,"la cantidad debe ser mayor o igual a cero",
                               "Cantidad Invalida",JOptionPane.WARNING_MESSAGE);
                       break;

                case 2:
                    formatoSalida = "" +"La suma de " + cantidad1 + " y " + cantidad2 +" es: " +
                            decimalFormato.format(sumarDigitos(cantidad1,cantidad2));
                    JOptionPane.showMessageDialog(null,formatoSalida,"Suma",JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    formatoSalida = "" + " La diferencia de " + cantidad1 + " y " + cantidad2 + " es: " +
                        decimalFormato.format(diferenciaDigitos(cantidad1,cantidad2));
                    JOptionPane.showMessageDialog(null, formatoSalida," Diferencia ",JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 4:
                    formatoSalida = "" + " La multiplicacion es " + cantidad1 + " y " + cantidad2 + " es " +
                            decimalFormato.format(productosDigitos(cantidad1,cantidad2));
                    JOptionPane.showMessageDialog(null, formatoSalida, " Multiplicacion ",JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 5:
                    formatoSalida = "" + " El modulo es " + cantidad1 + " y " + cantidad2 + " es " +
                            decimalFormato.format(moduloDigitos(cantidad1,cantidad2));
                    JOptionPane.showMessageDialog(null,formatoSalida," Modulo " , JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 6:
                    formatoSalida = "" + " El cociente es " + cantidad1 + " y " + cantidad2 + " es " +
                            decimalFormato.format(cocienteDigites(cantidad1,cantidad2));
                    JOptionPane.showMessageDialog(null,formatoSalida, "Coenciente ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Gracias por utilizar el programa","Salida",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Es necesario ingresar una opcion del menu","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);

            }


        }

        System.exit(0);

    }

 //DECLARACION DE METODOS O FUNCIONES
    public static float sumarDigitos(float cantidad1, float cantidad2){
        return  cantidad1+cantidad2;
    }
    public static float diferenciaDigitos(float cantidad1, float cantidad2 ){
        return cantidad1 - cantidad2;
    }
    public static float productosDigitos(float cantidad1, float cantidad2){
        return cantidad1 * cantidad2;
    }
    public static float moduloDigitos(float cantidad1, float cantidad2){
        return cantidad1%cantidad2;
    }
    public static float cocienteDigites(float cantidad1, float cantidad2){
        return cantidad1/cantidad2;
    }

}