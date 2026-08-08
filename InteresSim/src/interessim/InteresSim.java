/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessim;

import java.util.Scanner;

/**3. Interés simple: Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
 *
 * @author angie
 */
public class InteresSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //Variables
        double capitalInicial =0;
        int  TasaAnual=0;
        int tiempo=0;
        double interes=0;                
        // Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
        
        System.out.println("Ingrese el capital inicial");
        capitalInicial = input.nextDouble();
        
        System.out.println("Ingrese la Tasa de Interes Anual");
        
        while (true) {
            if (!input.hasNextInt()){
        System.out.println("Error, no se permiten decimales, Ingrese un numero entero:");
        input.next(); //limpiador
    }
            TasaAnual = input.nextInt();
        
        System.out.println("Ingrese el tiempo en Años");
        tiempo= input.nextInt();
        
        interes = (capitalInicial * TasaAnual * tiempo)/100;
        System.out.printf("El interes Generado es %.2f", interes);
        
        }
        
        
    }//fin main
    
}//fin class
