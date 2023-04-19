
/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese un numero entero: ");
        int num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble del numero " + num + " es " + doble);
        System.out.println("El triple del numero " + num + " es " + triple);
        System.out.println("La raiz cuadrada del numero " + num + " es " + raiz);
 
    }
}