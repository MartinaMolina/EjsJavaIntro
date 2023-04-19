
/* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */
 

package ejsjavaintro;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        int enteros [] = new int [100];
        
        for (int i = 0; i < enteros.length; i++) {
        // tambien puede ser: i=0; i<100; i++ 
        // (al 100 no lo toma, llega hasta 99 porque empieza en 0)(de 0 a 99 = 100 n°)
            enteros[i] = i+1;
        }
        
        System.out.println("A continuacion, se muestran los 100 primeros n° enteros ordenados en forma decreciente: ");
        
        for (int i = 99; i >= 0; i--) {
            System.out.print(enteros[i] + " ");
        }
    }
}