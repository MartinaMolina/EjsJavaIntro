
// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. 


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Hola " + nombre + " !");
        
    }
}
