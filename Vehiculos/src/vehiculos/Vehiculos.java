/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.Scanner;

/**Objetivos
 * 1. Seleccion Multiple
 *  a. Estructura
 *  Tipos de Condicion
 * 2. Formateo de Cadenas(printf)
 *
 * @author angie
 */
public class Vehiculos {

    /**Desarrollar un algoritmo que permita seleccionar una marca
     * de vehiculo que mejor se situe a nuestros gustos, Siendo entonces, cumplir
     * el gusto de escoger un modelo particular.
     * Mostrar en pantalla un mensaje alusivo.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        int seleccionMenu =0;
        char seleccionSubMenu ='@';
        
       
        Scanner sc =new Scanner (System.in);
        
         System.out.println(" Catalogo de vehiculos improtados");
         System.out.printf("%-20s|  |%10s\n", "Eriz shop!!", "Importadora|");
         System.out.println("--------------------");
         System.out.println("1. Toyota");
         System.out.println("2. Honda");
         System.out.println("3. Mitsubishi");
         System.out.println("4. Ferrari");
         System.out.println("5. Volkzwagen");
         seleccionMenu = sc.nextInt();
         
         // if else--> rango de valores
         switch (seleccionMenu){  
//ests igualado a algo, se usan casos que se encierran entre corchetes {}
             // switch hablamos de valores que estan en el mismo nivel, un solo valor puntual, 
             //se puede hacer con ek if if(seleccionMenu == 1){, luego }else if (seleccionMenu==2){ PERO es mas ordenado con el switch
             //equivalente con el IF 
         case 1:
             System.out.println("Catalogo Toyota");
             System.out.println("A. Yaris");
             System.out.println("B. 22R");
             System.out.println("C. Tacoma");
             System.out.println("Respuesta:");
             sc.nextLine();//Limpieza buffer
             seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
             //Limpia buffer cuando pasa de un numero a un caracter, de caracter
               switch(seleccionSubMenu){ //ejemplo para demostrat que el swithc se puede utilizar
                  // con numeros o con letras, pero SIEMPRE ENTEROS
                   case 'A':
                       break;
                   case 'B':
                       break;
                       case'C':
                           break;
                       default:
                           break;
               }//Fin de switch
               
             break;
                //break;si no hay break no detiene o rompe para salirse del bllque en el que se enuentra, 
                //salirse del bloque dentro de los corchetes, el swithch va acompa;ado del break
        
         case 2:
             System.out.println("Catalogo Honda");
             System.out.println("A. CRV");
             System.out.println("A. Civic");
             System.out.println("A. Accord");
             System.out.println("Respuesta:");
             sc.nextLine();//Limpieza buffer
             seleccionSubMenu = sc.nextLine().charAt(0);
                break;
         case 3: 
             System.out.println("Catalogo Mitsubishi");
             System.out.println("A. L200");
             System.out.println("B. Outlander");
             System.out.println("C. Lancer");
             System.out.println("Respuesta:");
             sc.nextLine();
             seleccionSubMenu =sc.nextLine().toUpperCase().charAt(0);
             if (seleccionSubMenu =='A'){
                 System.out.printf("%s Carro de Trabajo%s\n","\u001B[31m","\u001B[0m");
             }else if (seleccionSubMenu=='B'){
                 System.out.printf("%s Carro de Lujo%s\n","\u001B[31m","\u001B[0m");
             }else if (seleccionSubMenu=='C'){
                 System.out.printf("%s Carro Deportivo%s\n","\u001B[31m","\u001B[0m");
             }else{
                 System.out.printf("Esa opcion no tenemos joven");
             }
                break;
         case 4:
             System.out.println("Catalogo Ferrari");
                break;
         case 5:
             System.out.println("Catalogo Volkwagen");
                break;
                //el ultimo caso se conoce como difault
         default:
             System.out.println("Lea compa... solo del 1 al 5");
             break; 
         }
    }//fin de main
    
}//fin de class
