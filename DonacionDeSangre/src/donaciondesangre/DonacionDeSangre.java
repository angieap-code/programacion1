/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;


import java.util.Scanner;

/**
 * 1.estruturas de seleccion Anidadas, una est5uctura 
 * dentro de otra 
 * 
 * 
 * 2.Y vamos a usar operadores booleanos
 *.   a.AND && 2 condiciones o mas, en espa;ol es (Y) 
 * ejemplo: Semana Morazanica
 * 
 * Dinero  Tiempo  Resultado
 * SI(V)        SI(V) SALES    (V)
 * SI  (V)   NO (F)  NO SALES  (F)
 * NO(F)      NO(F)    NO SALES(F)
 * AND: si uno de los operadores es falso el resultado es falso
 * 
 * 
 *    b. OR
 * ejemplo: Comida del foodcourt del Molote
 * Hamburguesa   Pasta   Resultado
 * SI(V)          SI(V)    LOGRA COMER(V)
 * SI(V)          NO(F)    LOGRA COMER (V)
 * NO (F)         SI(V)    LOGRA COMER(V)
 * NO(F)        NO(F)      NO LOGRA COMER(F)
 * 
 * SI AL MENOS UNA CONDICION ES VERDADERO, EL RESULTADO ES VERDADERO
 * 
 * 
 *    c. NOT ! (NEGACION O OPUESTO)
 * SI TE GUSTA LA CLASE   RESULTADO
 * SI(V)                   NO(F)
 * NO(F)                   SI(V)
 * 
 * SI LA CONDICION ES FALSA, EL RESULTADO ES VERDADERO, 
 * SI LA CONDICION ES VERDADERO EL RESULTADO ES FALSO
 * 3.operacion ternaria
 * @author angie
 */
public class DonacionDeSangre {

    /**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su }
     * edad (18-65) y peso (Mas de 110lbs)
     * Si se llega a cumplir los criterioe antes expuestos, solo
     * se podra donar sangre si ha comido
     * 
     * Otro elemento que se tiene que considerar para poder dnar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los
     * nivveles adecuados.
     * 
     *Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     * //% entero printf es %d
     * // DECLARACION DE VARIABLES//
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //declaracion de variables
        int edad=0;
        int peso=0;
        boolean desayuno=true;
        char respuesta='0';
        int hierro=0;
        String genero="Masculino";
        
        System.out.println("Cual es su edad?");
        edad= input.nextInt();
        System.out.println("\nCual es su peso");
        peso= input.nextInt();
        
        if (edad>=18 && edad <=65 && peso >=110){
  input.nextLine(); //limpiar buffer
            System.out.println("Ha comido? S o N ");
            respuesta= input.nextLine ().charAt(0);
            if (respuesta=='S'|| respuesta=='s'){ 
            System.out.println("Si puede donar sangre"); 
            desayuno= true;
            desayuno= false;
                /*un if dentro de otro if es una ESTRUCTURA ANIDADA*/
                /* solo queremos que reconozca si ya comio, entonces solo
                se marca la S mayuscula o la s minuscula para que acepte cualquiera de las 2 
                el OR es ==, no se pone la N porque no queremos que la acete como respuesta*/
  
            }
            else{
                System.out.println("Es necesario que comas");
            }
        }else{
            System.out.println("No puede donar sangre");
            
        }
        
        System.out.println("Ingrese su nivel de hierro en sangre");
        hierro= input.nextInt();
        input.nextLine();
        
        System.out.println(" Ingrese su genero");
        genero= input.nextLine().toUpperCase();
        
        if ((hierro >=14 && genero.equals("MASCULINO")) || (hierro >=12 && genero.equals("FEMENINO") )){
        System.out.println("Si puede donar sangre");
        
        }else{
            System.out.println("No puede donar sangre");
        }
    }//find e main
    
} //fin de la clase
