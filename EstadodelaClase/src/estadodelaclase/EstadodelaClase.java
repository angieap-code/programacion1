/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadodelaclase;

/**
 *
 * @author angie
 */
public class EstadodelaClase {

    /**
     * 1.Conocer las estructuras de seleccion
     *  a. Toma de decisiones simple
     *  b. Toma de decision doble
     *  c. Decisiones numericos y caracteres/cadenas
     * 
     * vamos a condicionar la toma de decisiones
     * 
     * @param args the command line arguments
     */
    /* 
    Se necesita desarrollar un algoritmo que determine si un bote 
    de agua de 500ml esta arriba de la mitad.
    
     a. Esta arriba de la mitad (dato numerico)
     b. Contiene agua o no (dato de caracter)
     c. Es amigable con el ambiente ( dato de cadena)
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        //Conociendo la estructura
        /*
1.PALABRA CLAVE "if" y/o "else"
2.El grupo de instrucciones de encierra entre {}
3.No se usa ";" para los bloques.
4. La condicion es una comparacion bajo cualquiera de los siguientes elementos:
 a. <  menor
 b. > mayor
 c. <= menor o igual
 d. >= Mayor o igual
 e. == igual (uso de 2 signos iguales)
 i. != distinto (signos pegados)
*/
        int cantidadAgua=0
System.out.println("El bote es de 500ml");
System.out.print("Cuanto liquido dices que contiene?");
cantidadAgua = input.nextInt();

if (cantidadAgua>= 250){
    System.out.println("Si, tiene mas de la mitad");
    System.out.println("Te lo puedes beber");
    System.out.println("No nos quedamos sin nada... hay suficiente");

    }// find e main
    
}//fin de class
