/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo2variables;

import java.util.Scanner;



/** 1. Cálculo con dos variables: Escribir un programa que solicite al usuario la base y la altura de un
rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.
 *
 * @author angie
 */
public class Calculo2Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //Variables
        double base=0;
        double altura=0;
        double resultado=0;
        double resultadoPerimetro=0;
        
        System.out.println("Ingrese la base del rectangulo");
        base =input.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        altura =input.nextDouble();
        
        resultado = base*altura;
        System.out.printf("%.2f es el area del rectangulo",resultado);
        //%f porque variable double/float
        
        
        resultadoPerimetro =((base*2)+(altura*2));
        System.out.printf("\n El perimetro es igual a %.2f",resultadoPerimetro);
        
        
    }//fin main
    
}// fin class
