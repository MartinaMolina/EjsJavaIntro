
/* Realizar un programa que solo permita introducir frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java. */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese una palabra: ");
        String frase = leer.nextLine();
        
        int largo = frase.length();
        
        if (largo == 8) {
          System.out.println("CORRECTO");
        } else {
          System.out.println("INCORRECTO");
        }
 
    }
}