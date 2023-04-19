
/* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * *
*     *
*     *
* * * * 

*/

package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
  
        System.out.print("Bienvenido, ingrese el tamaño que desea para su cuadrado: ");
        int tamaño = leer.nextInt();
        
        System.out.println("");
        
        // Linea superior
        for(int columna = 1; columna <= tamaño; columna++) {
            System.out.print(" * ");
        }
        System.out.println("");
           
        // Centro de la forma
        for(int fila = 2; fila < tamaño; fila++) {
            System.out.print(" * ");
        for(int columna = 2; columna < tamaño; columna++) {
            System.out.print("   ");
        }
            System.out.println(" * ");
        }
           
        // Linea inferior
        for(int columna = 1; columna <= tamaño; columna++) {
            System.out.print(" * ");
        }
        System.out.println("");
    }
}
