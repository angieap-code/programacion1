/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metereologia;

import java.util.Scanner;

/** Estructuras de Repeticion
        Objetivo
        * 1. conocer las diferentes tipos  Estructuras de Repeticion que hay
        * 2. Analizar los componentes de todo ciclo de repeticion estructura General de todo ciclo de repeticion
 *3. Construir un algoritmo con un ciclo de repeticion
 * @author angie
 */
public class Metereologia {

    /** Desarrollar un algoritmo que me permita simular una estacion metereologica,
     * que va registrando las temperaturas a lo largo de una semana
     * 1. Registrar el dia en general
     * 2. registrar en 2 jornadas, (dia y noche) 
     * * Mostrando el promeedioa general y un mensaje de caliente o frio
     * para cada jornada
     * 
     * CICLOS DE REPETICION
     * 1. while
     * 2. Do while
     * 3. For
     * 4. Foreach
     * 
     * Componentes de los ciclos de repeticion: independientemente del ciclo de repeticion que usemos
     * 1. Valor de Inicio -> Variable de Control
     * 2.Condicion -> Establece el Limite, superior inferior de ifgualdad
     * 3 Elemento que Modifique el estado de la condicion->Incrementa/Decrementa o Iguala el valor de inicio
     * 
     * El ciclo de repeticion se ejecuta y repite siempre y cuando la condicion se mantenga VERDADERO!!!
     * si es FALSO se detiene
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        
        //VARIABLES
        int Temperatura=0;
        int dia=1; //Valor de inicio(componentes) VARIABLE DE CONTROL en 0
        int TempAcum=0; //Acumulador
        double promedioTemp =0;
        
//condicion, entre los parentesis va cuantas veces se repite y que se repite
        while( dia <= 7 ){
        // instrucciones que se repiten
            System.out.println("Ingrese la temperatura");
            Temperatura =sc.nextInt();
            
             TempAcum += Temperatura; //TempAcum= TempAcum+Temperatura
             
        System.out.printf("Dia %d: \tTemperatura: %d \t TempAcumulado %d",dia, Temperatura, TempAcum);
        TempAcum += Temperatura; //TempAcum= TempAcum+Temperatura
        
            System.out.println(" ");
        
//Modificacion
        //OPCION 1
        //dia= dia+1;
        //dia +=1 esto es lo mismo
        
        //OPCION 2
        dia++; //Aumento de 1 en 1 -> POST Incremento
        
        }//fin de while
       // promedioTemp= TempAcumm /7; //hard coding, porque si lo modifica se va a dividir siempre entre 7
       dia-- ; // Resta una unidad
       System.out.printf("Dia Final: %d", dia);
       promedioTemp = TempAcum /dia;
       
        System.out.printf("Promedio %.2f", promedioTemp);
       

    }//fin de main
    
}// fin de class
