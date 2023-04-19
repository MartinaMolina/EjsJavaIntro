
/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese una frase: ");
        String frase = leer.nextLine();
        
        String minusculas = frase.toLowerCase();
        System.out.println("La frase en MINUSCULAS queda asi: " + minusculas);
        
        String mayusculas = frase.toUpperCase();
        System.out.println("La frase en MAYUSCULAS queda asi: " + mayusculas);
    }
}