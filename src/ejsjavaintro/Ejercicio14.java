
/* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € 

*/


package ejsjavaintro;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
  
        System.out.print("Bienvenido/a, ingrese la cantidad de euros que quiere convertir: ");
        double euros = leer.nextDouble();
        
        System.out.println("");
        
        System.out.println("A continuacion, elija a que moneda quiere hacer su conversion: ");
        System.out.println("1) Dolares");
        System.out.println("2) Libras");
        System.out.println("3) Yenes");
        System.out.println("");
        String moneda = "";
        
        Conversion(euros, moneda);
        
    }
    
    public static void Conversion (double euros, String moneda) {
        
        Scanner leer = new Scanner(System.in);
        
        double libras = 0.86;
        double dolares = 1.28611;
        double yenes = 129.852;
        
        double PasajeLibras = euros * libras;
        double PasajeDolares = euros * dolares;
        double PasajeYenes = euros * yenes;
        
        moneda = leer.nextLine();
        System.out.println("");
        
        switch (moneda) {
            case "1":
                System.out.println(euros + " € son " + Math.round(PasajeDolares) + " Dolares");
                break;
            case "2":
                System.out.println(euros + " € son " + Math.round(PasajeLibras) + " Libras");
                break;
            case "3":
                System.out.println(euros + " € son " + Math.round(PasajeYenes) + " Yenes");
                break;
        }  
    }
}
    
