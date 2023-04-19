
/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese los grados (°C) para su conversion a Fahrenheit (°F): ");
        double grados = leer.nextDouble();
        
        double fahrenheit = 32 + (9 * grados / 5);
        
        System.out.println(grados + " °C es equivalente a " + fahrenheit + " °F" );
        
    }
}