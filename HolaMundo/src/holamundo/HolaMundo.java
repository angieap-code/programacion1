/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author angie
 */
public class HolaMundo {
// comentario de una linea
    /* pleca mas asterisco abrir comentario, 
    asterisco pleca cierre de comentario*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //java es sensible a Mayusculas-Minusculas
        /* Objetivo
        1. imprimir en la pantalla
        a. Diferentes formas para poder imprimir en pantalla
        b. Caracteres de escape
        2. Captura de Datos por parte del usuario.
        
    
        */
        System.out.println ("Hola... como estas");
        System.out.println ("Este es mi primer programa");
        System.out.println("Yujuuu...estoy con Java");
        System.out.print("Soy Angie Paz ");
        
        System.out.println("Soy Alumna de progra");
        
        System.out.printf("Esto es la clase de %S\n", "Programacion");
        System.out.println("");
        //alt+92 contrapleca
        System.out.printf("Esto es %sla clase de\n", "Programacion");
        System.out.println("");
        
        System.out.printf("%S Esto es la clase de\n", "Programacion");
        System.out.println("");
        
         System.out.printf("Hola \n como \n estas \n en la clase %s\n?" ,"Programacion");
        System.out.println("");
        
         System.out.printf("Hola \t como \t estas \t en la clase %s\t?", "Programacion");
        System.out.println("");
        
        //Variables
        int tiempo; // tipo entero
        double promedio; //tipo decimal
        String nombre; // tipo cadena
        char inicial; // tipo caracter puede ser una letra, un digito numerico, simbolo especial
        boolean estado; // tipo booleano - solo acepta dos estados, True / False
        tiempo=3;
        nombre= "Angie";
        inicial='A';
        
        System.out.printf("Tu nombre es: %s",nombre);
        System.out.printf(" %d veces a la semana recibes la clase\n",tiempo);
        System.out.printf("Te llamare %c inicial",inicial);
        
    }//fin de la funcion main
    
}//fin sw l CLase Hola Mundo
