/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JOHN JAIRO
 */
public class AlCuadrado {
    
    static void cuadradoNumero(){
        
        DecimalFormat dc = new DecimalFormat("#.####");
        
        int numero = 0;
        int cuadrado = 0;
        int longitud = 0;
        int mitad = 0;
        int iteraciones = 0;
        double valorFinal = 0;
        String aux = "";
        String cadena = "";
        String subCadena = "";
        
        aux = JOptionPane.showInputDialog("Ingrese un número 2n: ");
        numero = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("Ingrese la cantidad de iteraciones: ");
        iteraciones = Integer.parseInt(aux);
        
        int iteracionesVector [] = new int [iteraciones];
        
        for (int i = 0; i < iteracionesVector.length; i++) {

            cuadrado = numero * numero;

            cadena = String.valueOf(cuadrado);

            longitud = cadena.length();
            mitad = longitud / 2;

            if (longitud < 4) {
                System.out.println("Con el número ingresado no se puede realizar la operación.");
            } else if (longitud == 4) {
                subCadena = cadena.substring(0, 3);
                valorFinal = Integer.parseInt(subCadena) / 10000;
                System.out.println("El valor de los cuatro número de la mitad es: " + subCadena
                        + "\tValor final elevado al cuadrado y con 0. antecedido es: " + valorFinal);
            } else if (longitud > 4) {
                subCadena = cadena.substring(mitad - 2, mitad + 2);
                valorFinal = Double.parseDouble(subCadena) / 10000;
                System.out.println("El valor de los cuatro número de la mitad es: " + subCadena
                        + "\tValor final elevado al cuadrado y con 0. antecedido es " + valorFinal);
            }
            numero = Integer.parseInt(subCadena);
            
        }
        
    }
    
}
