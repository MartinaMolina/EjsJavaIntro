
/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. */


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido/a, ingrese un numero limite: ");
        int num = leer.nextInt();
        
        while (num < 1) {
            System.out.println("Numero invalido, solo numeros POSITIVOS. Intente de nuevo: ");
            num = leer.nextInt();
        }
        
        int suma = 0;
            
        do {
            System.out.println("Escriba un numero: "); 
            int num1 = leer.nextInt();
            suma = suma + num1;
        } while (suma < num);
        
        System.out.println("");
        System.out.println("Perfecto! Ya has llegado al limite ingresado (" + num + ")");
    }
}