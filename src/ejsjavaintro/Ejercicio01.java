
/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma. */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese 2 numeros enteros para calcular su sumatoria: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es igual a " + suma);
        
    }
}
